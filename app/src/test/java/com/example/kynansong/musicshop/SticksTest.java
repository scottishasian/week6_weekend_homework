package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SticksTest {

    Sticks sticks;

    @Before
    public void before() {
        sticks = new Sticks(4.50, 9.25, UsedBy.DRUMS, OtherTypes.STICKS, "Regal Tip");
    }

    @Test
    public void testGetStickBrand() {
        assertEquals("Regal Tip", sticks.getStickBrand());
    }
}
