package com.codewars.kyu8.fundamentals.stringrepeat;

/**
 * @author Iuriy Gaydarzhi.
 * @since 16.03.2021
 *
 * Write a function called [repeat_string] which repeats the given string [str] exactly [count] times.
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */
public class Solution {

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
