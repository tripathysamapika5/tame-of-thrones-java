package com.geektrust.tripathysamapika.tameofthrones.util;

import com.geektrust.tripathysamapika.tameofthrones.crypto.CipherInterface;
import com.geektrust.tripathysamapika.tameofthrones.crypto.Key;

public class Message {
    private Key key;
    private String emblem;
    private String encryptedMessage;
    private CipherInterface cipher;


    Message(CipherInterface cipher, Key key, String emblem, String encryptedMessage){
        this.cipher = cipher;
        this.key = key;
        this.emblem = emblem;
        this.encryptedMessage = encryptedMessage;
    }

    /**
     * It will validate the encryption is correct or not
     * @return true/false
     */
    public boolean isValidMessage(){
        String decryptedMessage = cipher.decrypt(key, encryptedMessage);
        return StringUtility.stringCharToCharComparison(this.emblem, decryptedMessage);
    }


}
