package com.codewars.kyu8.fundamentals.removeexclamationmarks;

/**
 * @author Iuriy Gaydarzhi.
 * @since 12.05.2021
 *
 * Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
 */
public class Solution {

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}
