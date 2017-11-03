package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(20.00, 40.00,"Red", "Wood", "Strum", Types.STRING, 6);
    }

    @Test
    public void testGetBuyPrice() {
        assertEquals(20.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void testGetSellPrice() {
        assertEquals(40.00, guitar.getSellPrice(), 0.01;
    }
}
