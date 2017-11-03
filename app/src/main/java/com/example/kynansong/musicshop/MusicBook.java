package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

public class MusicBook extends OtherItems{

    private String author;
    private DifficultyLevel level;

    public MusicBook(double buyPrice, double sellPrice, UsedBy usedBy, OtherTypes otherTypes, String author, DifficultyLevel level) {
        super(buyPrice, sellPrice, usedBy, otherTypes);

        this.author = author;
        this.level = level;
    }

    public String getAuthor() {
        return this.author;
    }

    public DifficultyLevel getLevel() {
        return this.level;
    }
}
