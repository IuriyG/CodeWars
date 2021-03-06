package com.codewars.kyu8.fundamentals.converatnumbertoastring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 06.03.2021
 */
public class KataTest {

    @Test
    public void test() {
        assertEquals("67", Kata.numberToString(67));
        assertEquals("123", Kata.numberToString(123));
        assertEquals("999", Kata.numberToString(999));
    }
}
