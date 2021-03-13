package com.codewars.kyu8.bugs.squashthebugs;

/**
 * @author Iuriy Gaydarzhi.
 * @since 13.03.2021
 */
public class Kata {

    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (String s : spl) {
            if (s.length() > longest) {
                longest = s.length();
            }
        }
        return longest;
    }
}
