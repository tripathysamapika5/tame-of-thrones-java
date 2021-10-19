package com.geektrust.tripathysamapika.tameofthrones.kingdom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestKingdomAir {

    KingdomAir kingdom;
    @BeforeEach
    void setUp() {
        kingdom = new KingdomAir();
    }

    @Test
    @DisplayName("Testing kingdome name and emblem for AIR kingdom")
    void testKingdomAir(){
        assertTrue(kingdom.getKingdomName().equalsIgnoreCase("Air"));
        assertTrue(kingdom.getKingdomEmblem().equalsIgnoreCase("Owl"));
    }
}
