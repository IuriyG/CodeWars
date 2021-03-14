package com.codewars.kyu8.bugs.squashthebugs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 13.03.2021
 */
public class KataTest {

    @Test
    public void basicTests() {
        // assertEquals("expected", "actual");
        assertEquals(7, Kata.findLongest("The quick white fox jumped around the massive dog"));
        assertEquals(10, Kata.findLongest("Take me to tinseltown with you"));
        assertEquals(7, Kata.findLongest("Sausage chops"));
        assertEquals(6, Kata.findLongest("Wind your body and wiggle your belly"));
        assertEquals(7, Kata.findLongest("Lets all go on holiday"));
    }
}