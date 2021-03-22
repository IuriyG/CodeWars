package com.codewars.kyu8.fundamentals.stringrepeat;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 16.03.2021
 */
public class SolutionTest {

    private final char[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQERSTUVWXYZ0123456789!@#$%^&*()-=_+[]{}|;:,.<>/?`~".toCharArray();

    @Test
    public void test4a() {
        assertEquals("aaaa", Solution.repeatStr(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
    }

    @Test
    public void test5empty() {
        assertEquals("", Solution.repeatStr(5, ""));
    }

    @Test
    public void test0a() {
        assertEquals("", Solution.repeatStr(0, "kata"));
    }

    @Test
    public void testRandom() {
        final Random rand = new Random();
        for (int testIteration = 0; testIteration < 10; ++testIteration) {
            final StringBuilder text = new StringBuilder(rand.nextInt(32));
            for (int i = 0; i < text.capacity(); ++i) {
                final int chi = rand.nextInt(characters.length);
                text.append(characters[chi]);
            }
            final String string = text.toString();

            final int timesToRepeat = rand.nextInt(32);
            final StringBuilder sb = new StringBuilder(timesToRepeat * string.length());
            for (int i = 0; i < timesToRepeat; ++i) {
                sb.append(text);
            }
            final String expected = sb.toString();

            assertEquals(expected, Solution.repeatStr(timesToRepeat, string));
        }
    }
}
