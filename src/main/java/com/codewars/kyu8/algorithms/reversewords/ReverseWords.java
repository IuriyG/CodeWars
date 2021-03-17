package com.codewars.kyu8.algorithms.reversewords;

/**
 * @author Iuriy Gaydarzhi.
 * @since 04.03.2021
 */
public class ReverseWords {

    public static String reverseWords(String str) {
        String[] array = new String[str.length()];
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int count = 0;
        for (String string : str.split(" ")) {
            array[a] = string;
            a++;
            count++;
        }
        for (int i = count - 1; i >= 0; i--) {
            sb.append(array[i]).append(" ");
        }
        return sb.deleteCharAt(str.length()).toString();
    }
}
