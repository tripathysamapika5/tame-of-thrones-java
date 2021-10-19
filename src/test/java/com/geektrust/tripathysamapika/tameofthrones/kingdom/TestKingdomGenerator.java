package com.geektrust.tripathysamapika.tameofthrones.kingdom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestKingdomGenerator {

    @Test
    @DisplayName("Should return True for space string else false")
    void testIsNameSpace(){
        assertTrue(KingdomGenerator.getInstance("Space") instanceof KingdomSpace);
        assertTrue(KingdomGenerator.getInstance("Air") instanceof KingdomAir);
        assertTrue(KingdomGenerator.getInstance("Fire") instanceof KingdomFire);
        assertTrue(KingdomGenerator.getInstance("Ice") instanceof KingdomIce);
        assertTrue(KingdomGenerator.getInstance("Land") instanceof KingdomLand);
        assertTrue(KingdomGenerator.getInstance("Water") instanceof KingdomWater);
        assertTrue(KingdomGenerator.getInstance("anythingelse") == null);

    }


}
