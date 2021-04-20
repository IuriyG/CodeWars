package com.codewars.kyu8.fundamentals.willyoumakeit;

/**
 * @author Iuriy Gaydarzhi.
 * @since 20.04.2021
 */
public class Kata {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump / mpg <= fuelLeft;
    }
}
