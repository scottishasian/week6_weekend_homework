package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(130.00, 250.00, "Black", "Wood", "Piano Noise", Types.GRAND, 5);
    }

    @Test
    public void testGetAge() {
        assertEquals(5, piano.getAge());
    }
}
