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

    public ShopObjects( double buyPrice, double sellPrice, Types type, int stock) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.type = type;
        this.stock = stock;

    }
}
