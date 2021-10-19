package com.geektrust.tripathysamapika.tameofthrones.kingdom;

import com.geektrust.tripathysamapika.tameofthrones.util.StringUtility;

public class KingdomGenerator {

    /**
     * This factory method is used to return the appropriate
     * kingdom object depending upon the input kingdom name
     * @param kingdomName (name of the kingdom in string)
     * @return Kingdom object
     */
    public static Kingdom getInstance(String kingdomName) {
        Kingdom kingdom;
        if (StringUtility.isValueSpace(kingdomName)){
            kingdom = new KingdomSpace();
        }else if (StringUtility.isValueLand(kingdomName)) {
            kingdom = new KingdomLand();
        }else if (StringUtility.isValueWater(kingdomName)) {
            kingdom = new KingdomWater();
        }else if (StringUtility.isValueIce(kingdomName)) {
            kingdom = new KingdomIce();
        }else if (StringUtility.isValueAir(kingdomName)) {
            kingdom = new KingdomAir();
        }else if (StringUtility.isValueFire(kingdomName)) {
            kingdom = new KingdomFire();
        }else{
            kingdom = null;
        }

        return kingdom;
    }
}
