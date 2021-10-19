package com.geektrust.tripathysamapika.tameofthrones.crypto;

public class Key {
    private Integer key;
    private String value;

    //default constructor
    Key(int key){
        this.key =key;
    }


    /** this method will return the integer key */
    public Integer getKey(){
        return this.key;
    }

}
