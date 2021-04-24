package com.codewars.kyu8.fundamentals.calculatebmi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 24.04.2021
 */
public class CalculateTest {

    private static String b(double w, double h) {
        double bmi = w / (h * h);
        return bmi > 30.0 ? "Obese" : bmi <= 30.0 && bmi > 25.0 ? "Overweight" : bmi <= 18.5 ? "Underweight" : "Normal";
    }

    @Test
    public void testBMI() {
        assertEquals("Underweight", Calculate.bmi(50, 1.80));
        assertEquals("Normal", Calculate.bmi(80, 1.80));
        assertEquals("Overweight", Calculate.bmi(90, 1.80));
        assertEquals("Obese", Calculate.bmi(100, 1.80));
    }

    @Test
    public void testRandom() {
        System.out.println("100 Random tests");
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < 99; i++) {
            double randomW = 40 + r.nextDouble() * 80;
            double randomH = r.nextDouble() + 0.50 * 2.23;
            assertEquals(b(randomW, randomH), Calculate.bmi(randomW, randomH));
        }
    }
}
