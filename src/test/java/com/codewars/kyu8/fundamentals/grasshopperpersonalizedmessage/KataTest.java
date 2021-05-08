package com.codewars.kyu8.fundamentals.grasshopperpersonalizedmessage;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 08.05.2021
 */
public class KataTest {

    private static final String[] NAMES = {"John", "George", "Michael", "Nick", "Tony", "Ben", "Maria", "Helen", "Jen", "Lucy", "Eva"};

    @Test
    public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Kata.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Kata.greet("Greg", "Daniel"));
    }

    @Test
    public void randomTests() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(NAMES.length);
            assertEquals("For inputs \"" + NAMES[a] + "\" and \"" + NAMES[a] + "\"",
                    "Hello boss",
                    Kata.greet(NAMES[a], NAMES[a]));
        }
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(NAMES.length / 2);
            int b = random.nextInt(NAMES.length / 2) + NAMES.length / 2;
            assertEquals("For inputs \"" + NAMES[a] + "\" and \"" + NAMES[b] + "\"",
                    "Hello guest",
                    Kata.greet(NAMES[a], NAMES[b]));
        }
    }
}
