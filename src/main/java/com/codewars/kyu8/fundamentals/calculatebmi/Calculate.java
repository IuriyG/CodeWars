package com.codewars.kyu8.fundamentals.calculatebmi;

/**
 * @author Iuriy Gaydarzhi.
 * @since 24.04.2021
 *
 * Calculate BMI.
 * Write function bmi that calculates body mass index (bmi = weight / height2).
 * if bmi <= 18.5 return "Underweight"
 * if bmi <= 25.0 return "Normal"
 * if bmi <= 30.0 return "Overweight"
 * if bmi > 30 return "Obese"
 */
public class Calculate {

    public static String bmi(double weight, double height) {
        String s;
        double rsl = weight / Math.pow(height, 2);
        if (rsl <= 18.5) {
            s = "Underweight";
        } else if (rsl > 18.5 && rsl <= 25.0) {
            s = "Normal";
        } else if (rsl > 25.0 && rsl <= 30.0) {
            s = "Overweight";
        } else {
            s = "Obese";
        }
        return s;
    }
}
