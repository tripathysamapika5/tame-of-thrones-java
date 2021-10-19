package com.geektrust.tripathysamapika.tameofthrones.crypto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSeaserCipher {
    @Test
    @DisplayName("Testing SeaserCipher decrypt method")
    void testDecrypt(){
        SeaserCipher obj = new SeaserCipher();
        assertTrue(
                obj
                        .decrypt(KeyGenerator.getInstance("owl"),"rzo")
                        .equalsIgnoreCase("owl")
        );
        assertTrue(
                obj
                        .decrypt(KeyGenerator.getInstance("gorilla"),"nvypssh")
                        .equalsIgnoreCase("gorilla")
        );

        assertTrue(
                obj
                        .decrypt(KeyGenerator.getInstance("panda"),"ufsif")
                        .equalsIgnoreCase("panda")
        );

        assertTrue(
                obj
                        .decrypt(KeyGenerator.getInstance("Octopus"),"vjavwbz")
                        .equalsIgnoreCase("Octopus")
        );

        assertTrue(
                obj
                        .decrypt(KeyGenerator.getInstance("Mammoth"),"thttvao")
                        .equalsIgnoreCase("Mammoth")
        );
        assertTrue(
                obj
                        .decrypt(KeyGenerator.getInstance("Dragon"),"jxgmut")
                        .equalsIgnoreCase("Dragon")
        );
    }

}
