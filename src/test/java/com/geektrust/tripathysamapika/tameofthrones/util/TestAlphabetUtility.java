package com.geektrust.tripathysamapika.tameofthrones.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAlphabetUtility {
    @Test
    @DisplayName("Testing jumpForward")
    void testJumpForward(){
        assertEquals('c', AlphabetUtility.jumpForward('a',2),"c should be returned");
        assertEquals('b', AlphabetUtility.jumpForward('y',3),"b should be returned");
    }

    @Test
    @DisplayName("Testing jumpBackward")
    void testJumpBackward(){
        assertEquals('x', AlphabetUtility.jumpBackward('b',4),"c should be returned");
        assertEquals('j', AlphabetUtility.jumpBackward('l',2),"b should be returned");
    }

}
