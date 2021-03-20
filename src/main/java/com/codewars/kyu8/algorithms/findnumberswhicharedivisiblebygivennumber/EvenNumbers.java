package com.codewars.kyu8.algorithms.findnumberswhicharedivisiblebygivennumber;

import java.util.Arrays;

/**
 * @author Iuriy Gaydarzhi.
 * @since 20.03.2021
 *
 * Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
 * First argument is an array of numbers and the second is the divisor.
 *
 * Example:
 * divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
 */
public class EvenNumbers {

    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(i -> i % divider == 0).toArray();
    }
}
