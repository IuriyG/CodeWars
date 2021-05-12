package com.codewars.kyu8.fundamentals.removeexclamationmarks;

import org.junit.Test;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 12.05.2021
 */
public class SolutionTest {

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Solution.removeExclamationMarks("Hello World!"));
    }

    @Test
    public void testSimpleString2() {
        assertEquals("Hello World", Solution.removeExclamationMarks("Hello World!!!"));
    }

    @Test
    public void testSimpleString3() {
        assertEquals("Hi Hello", Solution.removeExclamationMarks("Hi! Hello!"));
    }

    @Test
    public void testRandomString() {
        String rs = String.format("%s!%s %s!%s", randomString(), randomString(), randomString(), randomString());
        assertEquals(solution(rs), Solution.removeExclamationMarks(rs));
    }

    private String randomString() {
        Random random = new Random();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZbcdefghijklmnopqrstuvwxyz";
        return IntStream.range(0, 10)
                .mapToObj(__ -> abc.charAt(random.nextInt(abc.length())))
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }

    private String solution(String s) {
        return s.replaceAll("!", "");
    }
}
