package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

public class OtherItems extends ShopObjects {

    private UsedBy usedBy;

    public OtherItems(double buyPrice, double sellPrice, Types type, UsedBy usedBy) {
        super(buyPrice, sellPrice, type);

        this.usedBy = usedBy;
    }

    public UsedBy usedByWhat() {
        return this.usedBy;
    }
}
