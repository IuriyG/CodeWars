package com.codewars.kyu8.algorithms.reversewords;

/**
 * @author Iuriy Gaydarzhi.
 * @since 04.03.2021
 *
 * Complete the solution so that it reverses all of the words within the string passed in.
 * Example:
 *
 * ReverseWords.reverseWords("The greatest victory is that which requires no battle");
 * // should return "battle no requires which that is victory greatest The"
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
