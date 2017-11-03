package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Drums drums;
    Piano piano;
    MusicBook musicBook;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar(10.00, 50.00, "Green", "Metal", "Strum", Types.STRING, 6);
        drums = new Drums(130.00, 250.00, "Yellow", "Plastic", "Boom", Types.PERCUSSION, "Drum Kit");
        piano = new Piano(200.00, 400.00, "White", "Wood", "Piano Noise", Types.GRAND, 30);
        musicBook = new MusicBook(12.00, 25.00, UsedBy.TRUMPET, OtherTypes.BOOK, "Zoe Slater", DifficultyLevel.MEDIUM);

    }

    @Test
    public void testAddStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void testRemoveItemFromStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.stockCount());
        shop.removeItemFromStock(0);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void testRemoveBookByIndex() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(drums);
        shop.addItemToStock(piano);
        shop.addItemToStock(musicBook);
        assertEquals(4, shop.stockCount());
        shop.removeItemFromStock(2);
        assertEquals(3, shop.stockCount());
    }
}
