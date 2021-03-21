package com.codewars.kyu8.fundamentals.returnnegative;

import org.junit.Test;

import java.util.Random;

import static java.lang.Math.abs;
import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 02.03.2021
 */
public class KataTest {

    private static final int NUM_RANDOM_TESTS = 10;
    private static final int MAX_X = 1000;

    private final Random random = new Random();

    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }

    @Test
    public void test2() {
        assertEquals(-9, Kata.makeNegative(-9));
    }

    @Test
    public void test3() {
        assertEquals(0, Kata.makeNegative(0));
    }

    @Test
    public void test4() {
        assertEquals(-1, Kata.makeNegative(1));
    }

    @Test
    public void test5() {
        assertEquals(-1, Kata.makeNegative(-1));
    }

    @Test
    public void testRandomPositives() {
        for (int i = 0; i < NUM_RANDOM_TESTS; i++) {
            int x = random.nextInt(MAX_X - 1) + 1;
            assertEquals(-abs(x), Kata.makeNegative(x));
        }
    }

    @Test
    public void testRandomNegatives() {
        for (int i = 0; i < NUM_RANDOM_TESTS; i++) {
            int x = -random.nextInt(MAX_X);
            assertEquals(-abs(x), Kata.makeNegative(x));
        }
    }
}
