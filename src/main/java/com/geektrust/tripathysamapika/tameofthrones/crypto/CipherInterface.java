package com.geektrust.tripathysamapika.tameofthrones.crypto;

public interface CipherInterface {

    String encrypt(Key key, String InputSTring);
    String decrypt(Key key, String encryptedString);

}
