package com.codewars.kyu8.fundamentals.themostaskedquestiononcodewars;

/**
 * @author Iuriy Gaydarzhi.
 * @since 14.03.2021
 *
 * What is the most asked question on CodeWars?
 * "Can someone explain ?".
 * You need to write a function [detect] that will check if a string starts with [Can someone explain],
 * case sensitive. Return [true] if so, [false] otherwise.
 * Let's hope you don't write a solution that makes people ask that question at you!
 */
public class Codewars {

    public static boolean detect(String comment) {
        return comment.startsWith("Can someone explain ");
    }
}
