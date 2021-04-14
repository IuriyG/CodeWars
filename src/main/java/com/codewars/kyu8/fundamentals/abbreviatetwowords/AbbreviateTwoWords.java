package com.codewars.kyu8.fundamentals.abbreviatetwowords;

/**
 * @author Iuriy Gaydarzhi.
 * @since 14.04.2021
 *
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.
 * It should look like this:
 * Sam Harris => S.H.
 * Patrick Ferne => P.F
 */
public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        char[] ch = name.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(ch[0]));
        for (int i = 0; i < name.length(); i++) {
            if (ch[i] == ' ') {
                sb.append('.');
                sb.append(Character.toUpperCase(ch[i + 1]));
                break;
            }
        }
        return sb.toString();
    }
}
