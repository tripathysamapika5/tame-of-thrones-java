package com.geektrust.tripathysamapika.tameofthrones.kingdom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestKingdomSpace{

    KingdomSpace kingdom;
    @BeforeEach
    void setUp() {
        kingdom = new KingdomSpace();
    }

    @Test
    @DisplayName("Testing kingdome name and emblem for space kingdom")
    void testKingdomIce(){
        assertTrue(kingdom.getKingdomName().equalsIgnoreCase("Space"));
        assertTrue(kingdom.getKingdomEmblem().equalsIgnoreCase("Gorilla"));
    }
}
