package com.example.kynansong.musicshop;

import Interfaces.Playable;

/**
 * Created by kynansong on 03/11/2017.
 */

public class Instruments extends ShopObjects implements Playable {

    private String colour;
    private String material;
    private String noise;
    private Types type;

    public Instruments(double buyPrice, double sellPrice, String colour, String material, String noise, Types type) {
        super(buyPrice, sellPrice);

        this.colour = colour;
        this.material = material;
        this.noise = noise;
        this.type = type;
    }

    public String getColour() {
        return this.colour;
    }

    public String getMaterial() {
        return this.material;
    }

    public Types getType() {
        return this.type;
    }

    public String play() {
        return this.noise;

    }
}
