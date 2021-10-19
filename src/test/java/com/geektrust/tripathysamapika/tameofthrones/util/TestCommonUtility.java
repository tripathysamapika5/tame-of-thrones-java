package com.geektrust.tripathysamapika.tameofthrones.util;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCommonUtility {
    @Test
    @DisplayName("Testing readFileToArrayList")
    void testReadFileToArrayList(){

        //String absoluteFilePath = new File(getClass().getResource("fileToTest.txt").getFile()).getAbsolutePath();
        File file = new File("src/test/resources/fileToTest.txt");
        String absolutePath = file.getAbsolutePath();
        ArrayList<String>  lines = CommonUtility.readFileToArrayList(absolutePath);

        ArrayList<String> linesToCompare = new ArrayList<String>();
        Collections.addAll(linesToCompare,"line 1","line 2","line 3","line 4","line 5");

        assertTrue(lines.equals(linesToCompare));
    }



}
