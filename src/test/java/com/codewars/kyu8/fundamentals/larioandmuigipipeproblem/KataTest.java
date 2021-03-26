package com.codewars.kyu8.fundamentals.larioandmuigipipeproblem;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 25.03.2021
 */
public class KataTest {

    String msg = "You must return an array from ";

    @Test
    public void basicTests() {
        System.out.println("Fixed tests...");
        assertArrayEquals(msg + "1-9", new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, Kata.pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9}));
        assertArrayEquals(msg + "1-12", new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, Kata.pipeFix(new int[]{1, 2, 3, 12}));
        assertArrayEquals(msg + "6-9", new int[]{6, 7, 8, 9}, Kata.pipeFix(new int[]{6, 9}));
        assertArrayEquals(msg + "-1-4", new int[]{-1, 0, 1, 2, 3, 4}, Kata.pipeFix(new int[]{-1, 4}));
        assertArrayEquals(msg + "1-3", new int[]{1, 2, 3}, Kata.pipeFix(new int[]{1, 2, 3}));
    }

    @Test
    public void randomTests() {
        Random randGen = new Random();
        System.out.println("100 Random Tests...");
        for (int i = 0; i < 100; i++) {
            int min = randGen.nextInt(98) * (randGen.nextInt(10) >= 5 ? 1 : -1);
            int max = randGen.nextInt(900) + 100;
            int length = max - min + 1;

            int[] pipesIn = new int[length];
            int[] pipesAns = new int[length];
            pipesIn[0] = min;
            pipesIn[length - 1] = max;
            pipesAns[0] = min;
            pipesAns[length - 1] = max;

            for (int e = min + 1; e <= max - 1; e++) {
                pipesAns[e - min] = e;
                if (randGen.nextInt(21) > 5)
                    pipesIn[e - min] = e;
            }

            assertArrayEquals(msg + min + "-" + max, pipesAns, Kata.pipeFix(pipesIn));
        }
    }
}
