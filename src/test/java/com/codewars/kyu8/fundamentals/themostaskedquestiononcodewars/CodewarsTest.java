package com.codewars.kyu8.fundamentals.themostaskedquestiononcodewars;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 14.03.2021
 */
public class CodewarsTest {

    private static boolean detect(String comment) {
        if (comment.length() < 20) return false;
        else return comment.startsWith("Can someone explain");
    }

    private static String veta() {
        String veta = "";

        Random r = new Random();
        int numberOfWords = 3 + r.nextInt(10);
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++) {
            String slova = "";
            int dlzka_slova = 3 + random.nextInt(8);
            for (int j = 0; j < dlzka_slova; j++) {
                slova += (char) ('a' + random.nextInt(26));
            }
            veta += slova + " ";
        }
        return veta.substring(0, veta.length() - 1);
    }

    @Test
    public void exampleTest() {
        assertEquals(true, Codewars.detect("Can someone explain to me what this kata is about?"));
        assertEquals(false, Codewars.detect("Can someone solve this kata for me?"));
        assertEquals(false, Codewars.detect("can someone explain to me how to enable caps lock/"));
    }

    @Test
    public void randomTest() {
        // Just Random tests
        for (int i = 1; i <= 50; i++) {
            String random_veta = veta().substring(0, 1).toUpperCase() + veta().substring(1) + "?";
            System.out.println(random_veta);
            assertEquals(detect(random_veta), Codewars.detect(random_veta));
        }

        // Random Tests with Question
        for (int j = 1; j <= 50; j++) {
            Random rand = new Random();
            String veticka = "Can someone explain";
            int ra = 1 + rand.nextInt(20);
            if (ra > 6 && ra < 13) veticka = veticka.toUpperCase();
            if (ra >= 13 && ra < 17) veticka = veticka.toLowerCase();
            if (ra >= 17) veticka = veticka.substring(1);
            String random_veta2 = veticka + " " + veta() + "?";
            System.out.println(random_veta2);
            assertEquals(detect(random_veta2), Codewars.detect(random_veta2));
        }
    }
}
