package com.codewars.kyu8.fundamentals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 02.03.2021
 * <p>
 * In this simple assignment you are given a number and have to make it negative.
 * But maybe the number is already negative?
 * Notes:
 * The number can be negative already, in which case no change is required.
 * Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
 */

public class Kata {

    public static int makeNegative(final int x) {
        if (x < 0) {
            return x;
        } else if (x > 0) {
            return Integer.parseInt("-" + x);
        } else {
            return x;
        }
    }
}
