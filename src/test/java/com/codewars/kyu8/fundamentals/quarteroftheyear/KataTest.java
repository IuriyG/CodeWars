package com.codewars.kyu8.fundamentals.quarteroftheyear;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Iuriy Gaydarzhi.
 * @since 01.04.2021
 */
public class KataTest {


    @Test
    public void fixedTests() {
        assertThat(Kata.quarterOf(3), is(1));
        assertThat(Kata.quarterOf(2), is(1));
        assertThat(Kata.quarterOf(4), is(2));
        assertThat(Kata.quarterOf(8), is(3));
        assertThat(Kata.quarterOf(9), is(3));
        assertThat(Kata.quarterOf(11), is(4));
        assertThat(Kata.quarterOf(12), is(4));
    }
}
