package com.geektrust.tripathysamapika.tameofthrones.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringUtility {
    @Test
    @DisplayName("Should return True for space string else false")
    void testIsNameSpace(){
        assertTrue(StringUtility.isValueSpace("Space"));
        assertTrue(StringUtility.isValueSpace("SPACE"));
        assertFalse(StringUtility.isValueSpace("anything else"));
    }

    @Test
    @DisplayName("Should return True for Land string else false")
    void testIsNameLand(){
        assertTrue(StringUtility.isValueLand("Land"));
        assertTrue(StringUtility.isValueLand("LAND"));
        assertFalse(StringUtility.isValueLand("anything else"));
    }

    @Test
    @DisplayName("Should return True for water string else false")
    void testIsNameWater(){
        assertTrue(StringUtility.isValueWater("Water"));
        assertTrue(StringUtility.isValueWater("WATER"));
        assertFalse(StringUtility.isValueWater("anything else"));
    }

    @Test
    @DisplayName("Should return True for ice string else false")
    void testIsNameIce(){
        assertTrue(StringUtility.isValueIce("Ice"));
        assertTrue(StringUtility.isValueIce("ICE"));
        assertFalse(StringUtility.isValueIce("anything else"));
    }

    @Test
    @DisplayName("Should return True for air string else false")
    void testIsNameAir(){
        assertTrue(StringUtility.isValueAir("Air"));
        assertTrue(StringUtility.isValueAir("AIR"));
        assertFalse(StringUtility.isValueAir("anything else"));
    }

    @Test
    @DisplayName("Should return True for Fire string else false")
    void testIsNameFire(){
        assertTrue(StringUtility.isValueFire("Fire"));
        assertTrue(StringUtility.isValueFire("FIRE"));
        assertFalse(StringUtility.isValueFire("anything else"));
    }

    @Test
    @DisplayName("Test countCharInString")
    void testCountCharInString(){
        assertEquals(3, StringUtility.countCharInString("Samapika",'a'),"3 should be returned");
        assertEquals(0, StringUtility.countCharInString("Samapika",'z'),"0 should be returned");
    }

    @Test
    @DisplayName("Test stringCharToCharComparison")
    void testStringCharToCharComparison(){
        assertFalse(StringUtility.stringCharToCharComparison("Samapika","asnajsasmj"));
        assertTrue(StringUtility.stringCharToCharComparison("sAmapika","sssshasgaaaasjgahgmhjaspnsaspinansk"));
        assertFalse(StringUtility.stringCharToCharComparison("sAmapika","sssshasgaaaasjgahgmhjaspnsaspinans"));

    }





}
