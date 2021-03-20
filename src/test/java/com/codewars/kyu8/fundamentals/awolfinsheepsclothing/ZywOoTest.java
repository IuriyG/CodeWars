package com.codewars.kyu8.fundamentals.awolfinsheepsclothing;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 18.03.2021
 */
public class ZywOoTest {

    @Test
    public void testSomething() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", ZywOo.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep", ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }

    private String warnTheSheepCheck(String[] array) {
        int wolf = 0;
        if (array[array.length - 1].equals("wolf") || array.equals("wolf")) {
            return "Pls go away and stop eating my sheep";
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                wolf = i;
            }
        }
        int sheep = array.length - wolf - 1;
        return "Oi! Sheep number " + sheep + "! You are about to be eaten by a wolf!";
    }

    private int randint(int min, int max) {
        return min + (int) (Math.floor(Math.random() * (max - min + 1)));
    }

    @Test
    public void randomTests() {
        for (int i = 0; i < 100; i++) {
            int n = randint(1, 10);
            String[] array = new String[n];
            Arrays.fill(array, "sheep");
            array[randint(1, n) - 1] = "wolf";
            assertEquals(warnTheSheepCheck(array), ZywOo.warnTheSheep(array));
        }
    }
}
