package com.geektrust.tripathysamapika.tameofthrones.kingdom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestKingdomIce {

    KingdomIce kingdom;
    @BeforeEach
    void setUp() {
        kingdom = new KingdomIce();
    }

    @Test
    @DisplayName("Testing kingdome name and emblem for ice kingdom")
    void testKingdomIce(){
        assertTrue(kingdom.getKingdomName().equalsIgnoreCase("Ice"));
        assertTrue(kingdom.getKingdomEmblem().equalsIgnoreCase("Mammoth"));
    }
}
