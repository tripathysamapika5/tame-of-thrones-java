package com.geektrust.tripathysamapika.tameofthrones;

import com.geektrust.tripathysamapika.tameofthrones.util.MessageUtility;

public class App {
    public static void main(String[] args) {
        try {
            //getting the input test file path
            String testFilePath = args[0];

            String validKingdomString = MessageUtility.decodeMessageFromTestFile(testFilePath);

            System.out.println(validKingdomString);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e+" happened. No input file path provided");
        }

    }
}
