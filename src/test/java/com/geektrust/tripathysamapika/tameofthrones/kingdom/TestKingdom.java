package com.geektrust.tripathysamapika.tameofthrones.kingdom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestKingdom {
    @Test
    @DisplayName("Testing getKingdomName method")
    void testGetKingdomName(){
        Kingdom kingdom = new Kingdom("Utkala", "trishula");
        assertEquals("Utkala", kingdom.getKingdomName(),"Utkala should be returned");
    }

    @Test
    @DisplayName("Testing getKingdomEmblem method")
    void testGetKingdomEmblem(){
        Kingdom kingdom = new Kingdom("Utkala", "trishula");
        assertEquals("trishula", kingdom.getKingdomEmblem(),"trishula should be returned");
    }

}
