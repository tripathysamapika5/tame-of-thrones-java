package com.geektrust.tripathysamapika.tameofthrones.util;

import java.util.Random;

public class StringUtility {

    private static String englishLowerCaseAlphabets = "abcdefghijklmnopqrstuvwxyz";

    /** This method will return true if the name is Space */
    public static boolean isValueSpace(String name) {
        return name.equalsIgnoreCase("Space");
    }

    /** This method will return true if the name is Land */
    public static boolean isValueLand(String name) {
        return name.equalsIgnoreCase("Land");
    }

    /** This method will return true if the name is Water */
    public static boolean isValueWater(String name) {
        return name.equalsIgnoreCase("Water");
    }

    /** This method will return true if the name is Ice */
    public static boolean isValueIce(String name) {
        return name.equalsIgnoreCase("Ice");
    }

    /** This method will return true if the name is Fire */
    public static boolean isValueFire(String name) {
        return name.equalsIgnoreCase("Fire");
    }

    /** This method will return true if the name is Air */
    public static boolean isValueAir(String name) {
        return name.equalsIgnoreCase("Air");
    }

    /** It generates random strings of random value and random length */
    public static String generateRandomString(){
        StringBuilder randomStringBuilder = new StringBuilder();
        Random rand = new Random();

        int maxLengthOfString = 5;
        int randomSizeOfString = rand.nextInt(maxLengthOfString);
        int alphabetsCount = StringUtility.englishLowerCaseAlphabets.length();

        for (int i = 0; i <= randomSizeOfString ; i++){
            int randomIndex = rand.nextInt(alphabetsCount);
            randomStringBuilder.append(StringUtility.englishLowerCaseAlphabets.charAt(randomIndex));
        }
        return randomStringBuilder.toString();
    }

    /**
     * It finds the count of character ch in inputString
     * @param inputString
     * @param ch
     * @return count of character ch in inputString
     */
    public static int countCharInString(String inputString, char ch){
        int count = 0;

        for (int i = 0; i < inputString.length(); i++){
            if (inputString.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    /**
     * It checks if all the charactrs of subString present in superString
     * @param subString
     * @param superString
     * @return true/false
     */
    public static boolean stringCharToCharComparison(String subString, String superString){
        subString = subString.toLowerCase();
        superString = superString.toLowerCase();

        boolean isValid = true;

        for (int i = 0; i< subString.length(); i++){
            int charCountInSuperString = StringUtility.countCharInString(superString, subString.charAt(i));
            int charCountInSubstring = StringUtility.countCharInString(subString, subString.charAt(i));
            if (charCountInSubstring > charCountInSuperString){
                isValid = false;
                break;
            }
        }
        return isValid;
    }

}
