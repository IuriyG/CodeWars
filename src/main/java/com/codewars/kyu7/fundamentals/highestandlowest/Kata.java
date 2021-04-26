package com.codewars.kyu7.fundamentals.highestandlowest;

import java.util.Arrays;

/**
 * @author Iuriy Gaydarzhi.
 * @since 26.04.2021
 * <p>
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
 * <p>
 * Example:
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * <p>
 * Notes:
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 */
public class Kata {

    public static String highAndLow(String numbers) {
        int[] num = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(num);
        return num[num.length - 1] + " " + num[0];
    }
}
