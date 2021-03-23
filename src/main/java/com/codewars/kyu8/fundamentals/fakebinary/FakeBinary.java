package com.codewars.kyu8.fundamentals.fakebinary;

/**
 * @author Iuriy Gaydarzhi.
 * @since 23.03.2021
 *
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
 * Return the resulting string.
 */
public class FakeBinary {

    public static String fakeBin(String numberString) {
        char[] ch = numberString.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = ch[i] < '5' ? '0' : '1';
        }
        return new String(ch);
        //        return numberString.replaceAll("[1-4]", "0").replaceAll("[5-9]", "1");
    }
}
