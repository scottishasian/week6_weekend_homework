package com.example.kynansong.musicshop;

/**
 * Created by kynansong on 03/11/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MusicBookTest {

    MusicBook musicBook;

    @Before
    public void before() {
        musicBook = new MusicBook(5.00, 10.00, UsedBy.PIANO, OtherTypes.BOOK, "Dan Colyer", DifficultyLevel.EASY);
    }

    @Test
    public void testUsedByWhat() {
        assertEquals(UsedBy.PIANO, musicBook.usedByWhat());
    }

    @Test
    public void testGetOtherType() {
        assertEquals(OtherTypes.BOOK, musicBook.getOtherTypes());
    }

    @Test
    public void testGetAuthor() {
        assertEquals("Dan Colyer", musicBook.getAuthor());
    }

    @Test
    public void testGetDifficultyTest() {
        assertEquals(DifficultyLevel.EASY, musicBook.getLevel());
    }
}
