package com.codewars.kyu8.fundamentals.twiceasold;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 15.03.2021
 */
public class TwiceAsOldTest {

    protected int localTwiceAsOld(int dadYears, int sonYears) {
        int difference = dadYears - sonYears * 2;
        if (difference > 0) {
            return difference;
        }
        return difference * -1;
    }

    @Test
    public void fixedTests() {
        assertEquals(30, TwiceAsOld.twiceAsOld(30, 0));
        assertEquals(16, TwiceAsOld.twiceAsOld(30, 7));
        assertEquals(15, TwiceAsOld.twiceAsOld(45, 30));
        assertEquals(22, TwiceAsOld.twiceAsOld(36, 7));
        assertEquals(5, TwiceAsOld.twiceAsOld(55, 30));
        assertEquals(0, TwiceAsOld.twiceAsOld(42, 21));
        assertEquals(20, TwiceAsOld.twiceAsOld(22, 1));
        assertEquals(29, TwiceAsOld.twiceAsOld(29, 0));
    }

    @Test
    public void randomTests() {
        Random rand = new Random();
        for (int i = 50; i > 0; i--) {
            int dad = rand.nextInt(82) + 18;
            int son = dad - (rand.nextInt(22) + 18);
            if (son < 0) {
                son = 0;
            }
            assertEquals(localTwiceAsOld(dad, son), TwiceAsOld.twiceAsOld(dad, son));
        }
    }
}
