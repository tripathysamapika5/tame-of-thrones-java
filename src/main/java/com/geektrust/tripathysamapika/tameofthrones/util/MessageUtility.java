package com.geektrust.tripathysamapika.tameofthrones.util;

import com.geektrust.tripathysamapika.tameofthrones.crypto.Key;
import com.geektrust.tripathysamapika.tameofthrones.crypto.KeyGenerator;
import com.geektrust.tripathysamapika.tameofthrones.crypto.SeaserCipher;
import com.geektrust.tripathysamapika.tameofthrones.kingdom.Kingdom;
import com.geektrust.tripathysamapika.tameofthrones.kingdom.KingdomGenerator;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MessageUtility {

    static SeaserCipher cipher = new SeaserCipher();

    /**
     * It reads the input test file with messages
     * @param inputTestFilePath
     * @return a string of all valid kingdoms where support has been gained by king Shan separated by space
     */
    public static String decodeMessageFromTestFile(String inputTestFilePath){
        ArrayList<String> lines = CommonUtility.readFileToArrayList(inputTestFilePath);
        LinkedHashSet<String> validKingdoms = new LinkedHashSet<String>();

        Key key;
        Kingdom kingdom;
        String emblem;
        Message message;

        for (String line: lines){
            String kingdomName = line.split("\\s",2)[0].trim();
            String encryptedString = line.split("\\s",2)[1].trim();

            kingdom = KingdomGenerator.getInstance(kingdomName);
            emblem = kingdom.getKingdomEmblem();
            key = KeyGenerator.getInstance(emblem);

            message = new Message(cipher, key, emblem, encryptedString);

            if (message.isValidMessage()){
                validKingdoms.add(kingdomName);
            }
        }
        String validKingdomString = "NONE";
        if (validKingdoms.size() >= 3){
            validKingdomString = "SPACE " + String.join(" ", validKingdoms);
        }

        return validKingdomString;

    }

}
