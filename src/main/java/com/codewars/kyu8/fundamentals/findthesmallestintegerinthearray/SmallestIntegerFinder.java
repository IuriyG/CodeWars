package com.codewars.kyu8.fundamentals.findthesmallestintegerinthearray;

import java.util.Arrays;

/**
 * @author Iuriy Gaydarzhi.
 * @since 24.03.2021
 *
 * Given an array of integers your solution should find the smallest integer.
 * For example:
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
