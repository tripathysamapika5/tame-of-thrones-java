package com.geektrust.tripathysamapika.tameofthrones.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageUtility {
    @Test
    @DisplayName("testcase : test decodeMessageFromTestFile")
    void testDecodeMessageFromTestFile(){
        File file;

        file = new File("src/test/resources/testFile1.txt");
        assertTrue("SPACE LAND ICE FIRE".equalsIgnoreCase(MessageUtility.decodeMessageFromTestFile(file.getAbsolutePath())));

        file = new File("src/test/resources/testFile2.txt");
        assertTrue("NONE".equalsIgnoreCase(MessageUtility.decodeMessageFromTestFile(file.getAbsolutePath())));

        file = new File("src/test/resources/testFile3.txt");
        assertTrue("SPACE AIR LAND ICE".equalsIgnoreCase(MessageUtility.decodeMessageFromTestFile(file.getAbsolutePath())));

        file = new File("src/test/resources/testFile4.txt");
        assertTrue("NONE".equalsIgnoreCase(MessageUtility.decodeMessageFromTestFile(file.getAbsolutePath())));

    }


}
