package com.codewars.kyu8.fundamentals.returnnegative;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 02.03.2021
 */
public class KataTest {

    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }

    @Test
    public void test2() {
        assertEquals(-4, Kata.makeNegative(-4));
    }

    @Test
    public void test3() {
        assertEquals(0, Kata.makeNegative(0));
    }
}