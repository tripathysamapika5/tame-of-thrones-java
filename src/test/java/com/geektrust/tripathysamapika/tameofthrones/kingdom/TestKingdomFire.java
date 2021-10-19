package com.geektrust.tripathysamapika.tameofthrones.kingdom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestKingdomFire {

    KingdomFire kingdom;
    @BeforeEach
    void setUp() {
        kingdom = new KingdomFire();
    }

    @Test
    @DisplayName("Testing kingdome name and emblem for Fire kingdom")
    void testKingdomFire(){
        assertTrue(kingdom.getKingdomName().equalsIgnoreCase("Fire"));
        assertTrue(kingdom.getKingdomEmblem().equalsIgnoreCase("Dragon"));
    }
}
