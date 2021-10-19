package com.geektrust.tripathysamapika.tameofthrones.kingdom;

public class Kingdom implements KingdomInterface{
    public String kingdomName;
    public String kingdomEmblem;

    public Kingdom(String kingdomName, String kingdomEmblem){
        this.kingdomName = kingdomName;
        this.kingdomEmblem = kingdomEmblem;
    }

    /** This method will return the kingdom name */
    public String getKingdomName(){
        return this.kingdomName ;
    }

    /** This method will return the kingdom emblem */
    public String getKingdomEmblem(){
        return this.kingdomEmblem;
    }
}
