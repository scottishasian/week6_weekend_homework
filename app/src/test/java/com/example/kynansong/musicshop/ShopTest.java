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

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar(10.00, 50.00, "Green", "Metal", "Strum", Types.STRING, 6);

    }

    @Test
    public void testAddStock() {
        shop.AddItemToStock(guitar);
        assertEquals(1, shop.stockCount());
    }
}
