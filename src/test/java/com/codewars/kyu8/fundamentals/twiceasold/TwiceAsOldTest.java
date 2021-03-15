package com.codewars.kyu8.fundamentals.twiceasold;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 15.03.2021
 */
public class TwiceAsOldTest {

    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOld.twiceAsOld(30, 0));
        assertEquals(16, TwiceAsOld.twiceAsOld(30, 7));
        assertEquals(15, TwiceAsOld.twiceAsOld(45, 30));
    }
}
