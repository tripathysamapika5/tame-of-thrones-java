package com.geektrust.tripathysamapika.tameofthrones.crypto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestKeyGenerator {
    @Test
    @DisplayName("Testing Key class")
    void testKey(){
        Key key1 = new Key(5);

        Key key2 = KeyGenerator.getInstance("xxxxx");
        assertTrue(key2.getKey() == key1.getKey());
    }

}
