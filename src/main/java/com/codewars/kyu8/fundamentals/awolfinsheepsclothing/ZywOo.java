package com.codewars.kyu8.fundamentals.awolfinsheepsclothing;

/**
 * @author Iuriy Gaydarzhi.
 * @since 18.03.2021
 */
public class ZywOo {

    public static String warnTheSheep(String[] array) {

        int count = 0;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[array.length - 1].equals("wolf")) {
                return "Pls go away and stop eating my sheep";
            } else if (array[i].equals("wolf")) {
                return "Oi! Sheep number " + count + "! You are about to be eaten by a wolf!";
            }
            count++;
        }
        return "Oi! Sheep number " + count + "! You are about to be eaten by a wolf!";
    }
}
