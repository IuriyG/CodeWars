package com.codewars.kyu8.fundamentals.twiceasold;

/**
 * @author Iuriy Gaydarzhi.
 * @since 15.03.2021
 *
 * Your function takes two arguments:
 *  1. current father's age (years)
 *  2. current age of his son (years)
 * Calculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
 */
public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {
        return dadYears < sonYears * 2 ? sonYears * 2 - dadYears : dadYears - sonYears * 2;
    }
}
