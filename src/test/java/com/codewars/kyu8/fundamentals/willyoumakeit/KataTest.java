package com.codewars.kyu8.fundamentals.willyoumakeit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Iuriy Gaydarzhi.
 * @since 20.04.2021
 */
public class KataTest {

    @Test
    public void testSomething() {
        assertTrue(Kata.zeroFuel(50, 25, 2));
        assertFalse(Kata.zeroFuel(100, 50, 1));
    }
}
