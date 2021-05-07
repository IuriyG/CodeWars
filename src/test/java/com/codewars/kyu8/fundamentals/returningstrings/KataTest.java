package com.codewars.kyu8.fundamentals.returningstrings;

import org.junit.Test;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 07.05.2021
 */
public class KataTest {

    public static String getStr() {
        int min = 10;
        int max = 50;
        int len = (int) floor(random() * (max - min + 1) + min);
        StringBuilder str = new StringBuilder();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < len; i++) {
            int r = (int) (random() * alpha.length());
            char ch = alpha.charAt(r);
            str.append(ch);
        }
        return str.toString();
    }

    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", Kata.greet("Ryan"));
    }

    @Test
    public void testSomething2() {
        String rand = getStr();
        String exp = "Hello, " + rand + " how are you doing today?";
        assertEquals(exp, Kata.greet(rand));
    }
}
