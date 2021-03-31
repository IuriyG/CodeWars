package com.codewars.kyu8.fundamentals.countingsheep;

import java.util.Arrays;

/**
 * @author Iuriy Gaydarzhi.
 * @since 31.03.2021
 *
 * Consider an array/list of sheep where some sheep may be missing from their place.
 * We need a function that counts the number of sheep present in the array (true means present).
 *
 * For example:
 * [true,  true,  true,  false,
 *   true,  true,  true,  true ,
 *   true,  false, true,  false,
 *   true,  false, false, true ,
 *   true,  true,  true,  true ,
 *   false, false, true,  true]
 * The correct answer would be 17.
 *
 * Hint: Don't forget to check for bad values like null/undefined.
 */
public class Counter {

    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(e -> e != null && e.equals(true)).count();
        }
    }
