package com.codewars.kyu8.fundamentals.reversedstrings;

/**
 * @author Iuriy Gaydarzhi.
 * @since 03.03.2021
 *
 * Complete the solution so that it reverses the string passed into it.
 */
public class Kata {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
