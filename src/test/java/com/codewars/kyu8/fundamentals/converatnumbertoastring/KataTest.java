package com.codewars.kyu8.fundamentals.converatnumbertoastring;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 06.03.2021
 */
public class KataTest {

    @Test
    public void basicTests() {
        assertEquals("67", Kata.numberToString(67));
        assertEquals("79585", Kata.numberToString(79585));
        assertNotEquals(79585, Kata.numberToString(79585));
        assertEquals("3", Kata.numberToString(1+2));
        assertEquals("-1", Kata.numberToString(1-2));
    }

    @Test
    public void randomTests() {
        Random randGen = new Random();
        System.out.println("Testing 20 random integers...");
        for (int i = 0; i < 20; i++) {
            int num = randGen.nextInt(100000);
            assertEquals("Should convert " + num + " to its correct string representation", Integer.toString(num), Kata.numberToString(num));
        }
    }
}
