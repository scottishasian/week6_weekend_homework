package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before() {
        drums = new Drums(100.00, 300.00, "Green", "Leather", "Boom", Types.PERCUSSION, "Bongo");
    }

    @Test
    public void testGetDrumSubType() {
        assertEquals("Bongo", drums.getSubType());
    }
}
