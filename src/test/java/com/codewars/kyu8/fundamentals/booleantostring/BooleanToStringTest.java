package com.codewars.kyu8.fundamentals.booleantostring;

import org.junit.Test;

import java.util.Random;

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

    @Test
    public void randomTests() {
        Random rand = new Random();
        for (int trial = 1; trial <= 40; trial++) {
            boolean val = rand.nextBoolean();
            String exp = val ? "true" : "false";
            assertEquals(exp, BooleanToString.convert(val));
        }
    }
}
