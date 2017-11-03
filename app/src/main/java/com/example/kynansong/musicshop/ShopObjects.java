package com.example.kynansong.musicshop;

import Interfaces.Sellable;

/**
 * Created by kynansong on 03/11/2017.
 */

public abstract class ShopObjects implements Sellable {

    private double buyPrice;
    private double sellPrice;
    private int stock;

    public ShopObjects( double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }


    public double markup() {
        return this.sellPrice -= this.buyPrice;
    }
}
