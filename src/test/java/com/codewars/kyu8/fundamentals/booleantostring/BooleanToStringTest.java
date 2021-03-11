package com.codewars.kyu8.fundamentals.booleantostring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 11.03.2021
 */
public class BooleanToStringTest {

    @Test
    public void testTrue() {
        assertEquals(BooleanToString.convert(true), "true");
    }

    @Test
    public void testFalse() {
        assertEquals(BooleanToString.convert(false), "false");
    }
}
