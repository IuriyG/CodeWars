package com.codewars.kyu7.fundamentals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 01.03.2021
 * <p>
 * Your task is to make a function that can take any non-negative integer as an argument and return it with
 * its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 * Examples:
 * Input: 42145 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 123456789 Output: 987654321
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        String s = Integer.toString(num);
        String[] array = s.split("");
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(array[i]);
        }
        for (int i = result.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (result[j] < result[j + 1]) {
                    int tmp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = tmp;
                }
            }
        }
        StringBuilder sb = new StringBuilder(result.length);
        for (int i : result) {
            sb.append(i);
        }
        return Integer.parseInt(sb.toString());
    }
}
