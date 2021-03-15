package com.codewars.kyu8.fundamentals.twiceasold;

/**
 * @author Iuriy Gaydarzhi.
 * @since 15.03.2021
 */
public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {
        return dadYears < sonYears * 2 ? sonYears * 2 - dadYears : dadYears - sonYears * 2;
    }
}
