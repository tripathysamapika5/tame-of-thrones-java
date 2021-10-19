package com.geektrust.tripathysamapika.tameofthrones.util;

import java.io.*;
import java.util.ArrayList;

public class CommonUtility {

    /**
     * It reads a file from a absolute path and stores them in a arrayList
     * @param absolutePath
     * @return lines
     */
    public static ArrayList<String> readFileToArrayList(String absolutePath){

        ArrayList<String> lines = null;
        try {

            File file = new File(absolutePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader  bufferedReader = new BufferedReader(fileReader);

            lines = new ArrayList<String>();
            String line;
            while((line=bufferedReader.readLine())!=null)
            {
                lines.add(line.trim());
            }

        }catch(FileNotFoundException e){

            e.printStackTrace();

        }catch(IOException e){

            e.printStackTrace();
        }

        return lines;
    }
}
