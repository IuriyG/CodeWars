package com.codewars.kyu8.fundamentals.findmaxandmin;

import java.util.Arrays;

/**
 * @author Iuriy Gaydarzhi.
 * @since 08.03.2021
 */
public class Kata {

    public int min(int[] list) {
        return Arrays.stream(list).min().orElseThrow();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().orElseThrow();
    }
}
