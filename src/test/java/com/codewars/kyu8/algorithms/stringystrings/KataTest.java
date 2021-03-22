package com.codewars.kyu8.algorithms.stringystrings;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 17.03.2021
 */
public class KataTest {

    private final Random randGen = new Random();

    @Test
    public void startTest() {
        assertEquals("Your string should start with a 1", '1', Kata.stringy(3).charAt(0));
    }

    @Test
    public void lengthTests() {
        System.out.println("Should return the correct length\n10 random tests...");
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50) + 1;
            assertEquals("Wrong length using size " + size, size, Kata.stringy(size).length());
        }
    }

    @Test
    public void stringTests() {
        System.out.println("Should return the correct string\n20 random tests...");
        for (int i = 0; i < 20; i++) {
            int size = randGen.nextInt(50) + 1;
            assertEquals("Whoops, wrong string with size " + size, stringyAns(size), Kata.stringy(size));
        }
    }

    private String stringyAns(int size) {
        String retStr = "";
        for (int i = 0; i < size; i++) {
            retStr += (i + 1) % 2;
        }
        return retStr;
    }
}
