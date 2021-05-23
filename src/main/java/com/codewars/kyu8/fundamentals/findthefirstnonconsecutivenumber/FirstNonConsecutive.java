package com.codewars.kyu8.fundamentals.findthefirstnonconsecutivenumber;

/**
 * @author Iuriy Gaydarzhi.
 * @since 13.05.2021
 * <p>
 * Your task is to find the first element of an array that is not consecutive.
 * By not consecutive we mean not exactly 1 larger than the previous element of the array.
 * E.g. If we have an array [1,2,3,4,6,7,8] then '1' then '2' then '3' then '4' are all consecutive but '6' is not,
 * so that's the first non-consecutive number.
 * If the whole array is consecutive then return null.
 * The array will always have at least 2 elements and all elements will be numbers.
 * The numbers will also all be unique and in ascending order.
 * The numbers could be positive or negative and the first non-consecutive could be either too!
 */
public class FirstNonConsecutive {

    static Integer find(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = array[i + 1];
            if (array[i] < index && array[i] + 1 != index) {
                return index;
            }
        }
        return null;
    }
}
