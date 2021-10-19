package com.geektrust.tripathysamapika.tameofthrones.kingdom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestKingdomWater{

    KingdomWater kingdom;
    @BeforeEach
    void setUp() {
        kingdom = new KingdomWater();
    }

    @Test
    @DisplayName("Testing kingdome name and emblem for water kingdom")
    void testKingdomIce(){
        assertTrue(kingdom.getKingdomName().equalsIgnoreCase("Water"));
        assertTrue(kingdom.getKingdomEmblem().equalsIgnoreCase("Octopus"));
    }
}
