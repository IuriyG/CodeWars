package com.codewars.kyu7.fundamentals.highestandlowest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Iuriy Gaydarzhi.
 * @since 26.04.2021
 */
public class KataTest {

    private static final int NUM_RANDOM_TESTS = 10;
    private static final int MAX_X = 1000;

    @Test
    public void someTest() {
        assertThat(Kata.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
    }

    @Test
    public void sortTest() {
        assertThat(Kata.highAndLow("10 2 -2 -10"), is("10 -10"));
    }

    @Test
    public void plusMinusTest() {
        assertThat(Kata.highAndLow("1 -1"), is("1 -1"));
    }

    @Test
    public void plusPlusTest() {
        assertThat(Kata.highAndLow("1 1"), is("1 1"));
    }

    @Test
    public void minusMinusTest() {
        assertThat(Kata.highAndLow("-1 -1"), is("-1 -1"));
    }

    @Test
    public void plusMinusZeroTest() {
        assertThat(Kata.highAndLow("1 -1 0"), is("1 -1"));
    }

    @Test
    public void plusPlusZeroTest() {
        assertThat(Kata.highAndLow("1 1 0"), is("1 0"));
    }

    @Test
    public void minusMinusZeroTest() {
        assertThat(Kata.highAndLow("-1 -1 0"), is("0 -1"));
    }

    @Test
    public void singleTest() {
        assertThat(Kata.highAndLow("42"), is("42 42"));
    }

    @Test
    public void randomTest() {
        Random r = new Random();

        for (int i = 0; i < NUM_RANDOM_TESTS; i++) {
            ArrayList<Integer> numbers = new ArrayList<>();

            for (int o = 0; o < r.nextInt(10) + 5; o++) {
                numbers.add(r.nextInt(MAX_X * 2) - MAX_X);
            }

            StringBuilder s = new StringBuilder(numbers.get(0).toString());
            for (int o = 1; o < numbers.size(); o++) {
                s.append(" ").append(numbers.get(o).toString());
            }
            assertThat(Kata.highAndLow(s.toString()), is(Collections.max(numbers) + " " + Collections.min(numbers)));
        }
    }
}
