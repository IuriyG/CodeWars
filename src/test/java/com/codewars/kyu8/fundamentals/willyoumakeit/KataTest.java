package com.codewars.kyu8.fundamentals.willyoumakeit;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author Iuriy Gaydarzhi.
 * @since 20.04.2021
 */
public class KataTest {

    public static boolean sol(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump <= mpg * fuelLeft;
    }

    @Test
    public void sampleTest() {
        assertTrue(Kata.zeroFuel(50, 25, 2));
        assertFalse(Kata.zeroFuel(100, 50, 1));
    }

    @Test
    public void basicTest() {
        assertTrue(Kata.zeroFuel(60, 30, 3));
        assertFalse(Kata.zeroFuel(70, 25, 1));
        assertFalse(Kata.zeroFuel(100, 25, 3));
    }

    @Test
    public void randomTest() {
        Random rnd = new Random();

        for (int i = 0; i < 100; ++i) {
            int d = rnd.nextInt(91) + 10;
            int m = rnd.nextInt(21) + 10;
            int g = rnd.nextInt(5) + 1;

            boolean expected = sol(d, m, g);
            boolean actual = Kata.zeroFuel(d, m, g);

            assertEquals(expected, actual);
        }
    }
}
