package com.geektrust.tripathysamapika.tameofthrones.crypto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestKey {
    @Test
    @DisplayName("Testing Key class")
    void testKey(){
        Key key = new Key(5);
        assertEquals(Integer.valueOf(5), key.getKey(),"5 should be returned");
    }

}
