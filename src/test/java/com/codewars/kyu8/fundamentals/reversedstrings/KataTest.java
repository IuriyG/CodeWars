package com.codewars.kyu8.fundamentals.reversedstrings;

import org.junit.Test;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 03.03.2021
 */
public class KataTest {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Test
    public void sampleTests() {
        assertEquals("dlrow", Kata.solution("world"));
        assertEquals("olleh", Kata.solution("hello"));
        assertEquals("", Kata.solution(""));
        assertEquals("h", Kata.solution("h"));
        assertEquals("selur srawedoC", Kata.solution("Codewars rules"));
    }

    @Test
    public void randomTests() {
        String chars = "abcdefghijklmnopqrstuvwxyz    ,./';123456789!?";
        Random random = new Random();

        for (int i = 0; i < 100; ++i) {
            String test = IntStream.range(1, random.nextInt(100))
                    .mapToObj(x -> Character.toString(chars.charAt(random.nextInt(chars.length()))))
                    .collect(Collectors.joining());

            String expected = solution(test);
            String actual = Kata.solution(test);

            assertEquals(expected, actual);
        }
    }
}
