package com.geektrust.tripathysamapika.tameofthrones.kingdom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestKingdomLand {

    KingdomLand kingdom;
    @BeforeEach
    void setUp() {
        kingdom = new KingdomLand();
    }

    @Test
    @DisplayName("Testing kingdome name and emblem for land kingdom")
    void testKingdomIce(){
        assertTrue(kingdom.getKingdomName().equalsIgnoreCase("Land"));
        assertTrue(kingdom.getKingdomEmblem().equalsIgnoreCase("Panda"));
    }
}
