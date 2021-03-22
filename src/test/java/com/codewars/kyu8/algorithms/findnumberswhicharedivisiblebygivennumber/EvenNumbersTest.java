package com.codewars.kyu8.algorithms.findnumberswhicharedivisiblebygivennumber;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 20.03.2021
 */
public class EvenNumbersTest {

    private static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(n -> n % divider == 0).toArray();
    }

    @Test
    public void testSimple() {
        assertArrayEquals(new int[]{2, 4, 6}, EvenNumbers.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2));
        assertArrayEquals(new int[]{3, 6}, EvenNumbers.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3));
        assertArrayEquals(new int[]{0, 4}, EvenNumbers.divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4));
    }

    @Test
    public void testRandom() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int n = 2 + r.nextInt(10);
            int[] a = r.ints(100, 0, 100).toArray();
            assertArrayEquals(divisibleBy(a, n), EvenNumbers.divisibleBy(a, n));
        }
    }
}
