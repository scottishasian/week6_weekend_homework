package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

public class Drums extends Instruments {

    private String subType;

    public Drums(double buyPrice, double sellPrice, String colour, String material, String noise, Types type, String subType) {
        super(buyPrice, sellPrice, colour, material, noise, type);

        this.subType = subType;
    }

    public String getSubType() {
        return this.subType;
    }
}
