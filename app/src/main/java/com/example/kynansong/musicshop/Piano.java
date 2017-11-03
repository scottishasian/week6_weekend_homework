package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

public class Piano extends Instruments {

    private int age;

    public Piano(double buyPrice, double sellPrice, String colour, String material, String noise, Types type, int age) {
        super(buyPrice, sellPrice, colour, material, noise, type);

        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
