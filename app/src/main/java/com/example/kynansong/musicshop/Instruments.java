package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

public class Instruments extends ShopObjects {

    private String colour;
    private String material;

    public Instruments(double buyPrice, double sellPrice, Types type, String colour, String material) {
        super(buyPrice, sellPrice, type);

        this.colour = colour;
        this.material = material;
    }

    public String getColour() {
        return this.colour;
    }

    public String getMaterial() {
        return this.material;
    }
}
