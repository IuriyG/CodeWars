package com.codewars.kyu8.fundamentals.areaorperimeter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 30.04.2021
 */
public class SolutionTest {

    private static int x(int a, int b) {
        return a == b ? a * b : 2 * (a + b);
    }

    @Test
    public void tests() {
        assertEquals(16, Solution.areaOrPerimeter(4, 4));
        assertEquals(32, Solution.areaOrPerimeter(6, 10), 32);
        for (int i = 1; i < 101; i++) {
            int a = (int) (Math.random() * (i + 50) + 1);
            int b = (int) (Math.random() * (i + 30) + 21);
            System.out.println("Testing for " + a + ", " + b);
            assertEquals(x(a, b), Solution.areaOrPerimeter(a, b));
        }
    }
}
