package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

public class Sticks extends OtherItems {

    private String brand;

    public Sticks(double buyPrice, double sellPrice, UsedBy usedBy, OtherTypes otherTypes, String brand) {
        super(buyPrice, sellPrice, usedBy, otherTypes);

        this.brand = brand;
    }

    public String getStickBrand() {
        return this.brand;
    }
}
