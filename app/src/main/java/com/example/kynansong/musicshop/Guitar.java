package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

public class Guitar extends Instruments {

    private int GuitarStrings;

    public Guitar(double buyPrice, double sellPrice, String colour, String material, String noise, Types type, int guitarStrings) {
        super(buyPrice, sellPrice, colour, material, noise, type);

        this.GuitarStrings = guitarStrings;
    }


}
