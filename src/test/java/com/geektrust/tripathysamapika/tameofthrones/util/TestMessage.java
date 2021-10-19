package com.geektrust.tripathysamapika.tameofthrones.util;

import com.geektrust.tripathysamapika.tameofthrones.crypto.Key;
import com.geektrust.tripathysamapika.tameofthrones.crypto.KeyGenerator;
import com.geektrust.tripathysamapika.tameofthrones.crypto.SeaserCipher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestMessage {
    @Test
    @DisplayName("test isValidMessage")
    void testIsValidMessage(){
        SeaserCipher cipher = new SeaserCipher();
        Key key = KeyGenerator.getInstance("owl");
        Message message = new Message(cipher, key, "owl", "rjhdhsdzdbsdhsooo");
        assertTrue(message.isValidMessage());

        message = new Message(cipher, key, "owl", "jhdhsdzdbsdhsooo");
        assertFalse(message.isValidMessage());

        message = new Message(cipher, key, "owl", "orz");
        assertTrue(message.isValidMessage());

        message = new Message(cipher, key, "owl", "ROZO");
        assertTrue(message.isValidMessage());

        message = new Message(cipher, key, "owl", "OWLAOWLBOWLC");
        assertFalse(message.isValidMessage());

        key = KeyGenerator.getInstance("panda");
        message = new Message(cipher, key, "panda", "FAIJWJSOOFAMAU");
        assertTrue(message.isValidMessage());

        message = new Message(cipher, key, "panda", "FDIXXSOKKOFBBMU");
        assertTrue(message.isValidMessage());

        key = KeyGenerator.getInstance("Mammoth");
        message = new Message(cipher, key, "Mammoth", "STHSTSTVSASOS");
        assertTrue(message.isValidMessage());

        message = new Message(cipher, key, "Mammoth", "MOMAMVTMTMHTM");
        assertTrue(message.isValidMessage());

        key = KeyGenerator.getInstance("Dragon");
        message = new Message(cipher, key, "Dragon", "AJXGAMUTA");
        assertTrue(message.isValidMessage());

    }
}
