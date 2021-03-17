package com.codewars.kyu8.algorithms.stringystrings;

/**
 * @author Iuriy Gaydarzhi.
 * @since 17.03.2021
 * <p>
 * write me a function stringy that takes a size and returns a string of alternating '1s' and '0s'.
 * the string should start with a 1.
 * a string with size 6 should return :'101010'.
 * with size 4 should return : '1010'.
 * with size 12 should return : '101010101010'.
 * The size will always be positive and will only use whole numbers.
 */
public class Kata {

    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();
        String str;
        int count = 1;
        for (int i = 0; i < size; i++) {
            if (count % 2 == 0) {
                str = "0";
            } else {
                str = "1";
            }
            count++;
            sb.append(str);
        }
        return sb.toString();
    }
}
