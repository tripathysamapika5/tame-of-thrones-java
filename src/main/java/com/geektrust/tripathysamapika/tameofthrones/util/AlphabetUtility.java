package com.geektrust.tripathysamapika.tameofthrones.util;

public class AlphabetUtility {

    /** it will jump provided steps forward in the english alphabet in rotations */
    public static char jumpForward(char alphabet, int steps){
        char jumpedAlphabet = (char)(alphabet + steps);

        if (jumpedAlphabet > 'z'){
            jumpedAlphabet = (char)('a'+(jumpedAlphabet - 'z' -1));
        }

        return jumpedAlphabet;
    }

    /** it will jump provided steps backward in the english alphabet in rotations */
    public static char jumpBackward(char alphabet, int steps){
        char jumpedAlphabet = (char)(alphabet - steps);

        if (jumpedAlphabet < 'a'){
            jumpedAlphabet = (char)('z' - ('a' - jumpedAlphabet -1));
        }

        return jumpedAlphabet;
    }
}
