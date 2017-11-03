package com.example.kynansong.musicshop;

import Interfaces.Sellable;

/**
 * Created by kynansong on 03/11/2017.
 */

public abstract class ShopObjects implements Sellable {

    private double buyPrice;
    private double sellPrice;
    private Types type;
    private int stock;

    public ShopObjects( double buyPrice, double sellPrice, Types type) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.type = type;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public Types getType() {
        return this.type;
    }

    public double markup() {
        return this.sellPrice -= this.buyPrice;
    }
}
