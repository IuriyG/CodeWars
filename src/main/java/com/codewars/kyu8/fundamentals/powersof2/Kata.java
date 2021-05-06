package com.codewars.kyu8.fundamentals.powersof2;

/**
 * @author Iuriy Gaydarzhi.
 * @since 06.05.2021
 * <p>
 * Complete the function that takes a non-negative integer 'n' as input, and returns a list of all the
 * powers of 2 with the exponent ranging from 0 to 'n' (inclusive).
 * <p>
 * Examples:
 * n = 0  ==> [1]        # [2^0]
 * n = 1  ==> [1, 2]     # [2^0, 2^1]
 * n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
 */
public class Kata {

    public static long[] powersOfTwo(int n) {
        long[] array = new long[n + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = (long) Math.pow(2, i);
        }
        return array;
    }
}
