package com.geektrust.tripathysamapika.tameofthrones.crypto;

public class KeyGenerator {

    /** this factor method returns the key instance using the inputstring */
    public static Key getInstance(String inputString){
        Key key = new Key(inputString.length());
        return key;
    }
}
