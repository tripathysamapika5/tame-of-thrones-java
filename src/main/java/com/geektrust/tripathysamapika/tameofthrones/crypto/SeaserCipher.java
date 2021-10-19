package com.geektrust.tripathysamapika.tameofthrones.crypto;

import com.geektrust.tripathysamapika.tameofthrones.util.AlphabetUtility;
import com.geektrust.tripathysamapika.tameofthrones.util.StringUtility;

public class SeaserCipher implements CipherInterface{

    private static String englishAlphabets;

    public SeaserCipher(){}

    /** It will encrypt the provided string using seaser cipher algorithm . the encryption is irreversible */
    public String encrypt(Key key, String InputString){
        Integer keyVal = key.getKey();
        InputString = InputString.toLowerCase();

        StringBuilder encryptedBuilder =new StringBuilder();
        char[] inputCharArray = InputString.toCharArray();

        for(char charItem : inputCharArray){
            encryptedBuilder.append(AlphabetUtility.jumpForward(charItem,keyVal));
            encryptedBuilder.append(StringUtility.generateRandomString());
        }
        return encryptedBuilder.toString();
    }

    /** It will decrypt the provided encryped string using seaser cipher algorithm . */
    public String decrypt(Key key, String encryptedString){
        Integer keyVal = key.getKey();
        encryptedString = encryptedString.toLowerCase();

        StringBuilder decryptedBuilder =new StringBuilder();
        char[] encryptedCharArray = encryptedString.toCharArray();

        for(char charItem : encryptedCharArray){
            decryptedBuilder.append(AlphabetUtility.jumpBackward(charItem,keyVal));
        }
        return decryptedBuilder.toString();
    }

}
