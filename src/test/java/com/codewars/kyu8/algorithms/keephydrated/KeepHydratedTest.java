package com.codewars.kyu8.algorithms.keephydrated;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 25.05.2021
 */
public class KeepHydratedTest {

    KeepHydrated kh = new KeepHydrated();

    @Test
    public void sampleTest1() {
        assertEquals(1, kh.liters(2));
    }

    @Test
    public void sampleTest2() {
        assertEquals(0, kh.liters(0.97));
    }

    @Test
    public void sampleTest3() {
        assertEquals(7, kh.liters(14.64));
    }

    @Test
    public void sampleTest4() {
        assertEquals(800, kh.liters(1600.20));
    }

    @Test
    public void sampleTest5() {
        assertEquals(40, kh.liters(80));
    }

    @Test
    public void randTesting() {

        for (int i = 0; i < 5; i++) {
            double r = Math.random() * 100 + 1; // To 100
            assertEquals(((int) (r / 2)), kh.liters(r));

            r = Math.random() * 10 + 1; // To 10
            assertEquals(((int) (r / 2)), kh.liters(r));
        }
    }
}
