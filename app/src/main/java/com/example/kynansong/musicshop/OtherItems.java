package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

public class OtherItems extends ShopObjects {

    private UsedBy usedBy;
    private OtherTypes otherTypes;

    public OtherItems(double buyPrice, double sellPrice, UsedBy usedBy, OtherTypes otherTypes) {
        super(buyPrice, sellPrice);

        this.usedBy = usedBy;
        this.otherTypes = otherTypes;
    }

    public UsedBy usedByWhat() {
        return this.usedBy;
    }

    public OtherTypes getOtherTypes() {
        return this.otherTypes;
    }
}
