package com.codewars.kyu8.fundamentals.quarteroftheyear;

/**
 * @author Iuriy Gaydarzhi.
 * @since 01.04.2021
 *
 * Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
 * For example:
 * month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter;
 * and month 11 (November), is part of the fourth quarter.
 */
public class Kata {

    public static int quarterOf(int month) {
        int count = 0;
        if (month >= 1 && month <= 3) {
            count = 1;
        } else if (month >= 4 && month <= 6) {
            count = 2;
        } else if (month >= 7 && month <= 9) {
            count = 3;
        } else if (month >= 10 && month <= 12) {
            count = 4;
        }
        return count;
    }
}
