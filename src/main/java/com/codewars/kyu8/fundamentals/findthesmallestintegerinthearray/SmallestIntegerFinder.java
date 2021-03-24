package com.codewars.kyu8.fundamentals.findthesmallestintegerinthearray;

import java.util.Arrays;

/**
 * @author Iuriy Gaydarzhi.
 * @since 24.03.2021
 */
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
