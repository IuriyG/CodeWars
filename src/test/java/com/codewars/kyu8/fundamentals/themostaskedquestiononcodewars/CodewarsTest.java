package com.codewars.kyu8.fundamentals.themostaskedquestiononcodewars;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author Iuriy Gaydarzhi.
 * @since 14.03.2021
 */
public class CodewarsTest {

    private static boolean detect(String comment) {
        if (comment.length() < 20) {
            return false;
        } else {
            return comment.startsWith("Can someone explain");
        }
    }

    private static String vet() {
        StringBuilder vet = new StringBuilder();

        Random r = new Random();
        int numberOfWords = 3 + r.nextInt(10);
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++) {
            StringBuilder sb = new StringBuilder();
            int word = 3 + random.nextInt(8);
            for (int j = 0; j < word; j++) {
                sb.append((char) ('a' + random.nextInt(26)));
            }
            vet.append(sb).append(" ");
        }
        return vet.substring(0, vet.length() - 1);
    }

    @Test
    public void exampleTest() {
        assertTrue(Codewars.detect("Can someone explain to me what this kata is about?"));
        assertFalse(Codewars.detect("Can someone solve this kata for me?"));
        assertFalse(Codewars.detect("can someone explain to me how to enable caps lock/"));
    }

    @Test
    public void randomTest() {
        // Just Random tests
        for (int i = 1; i <= 50; i++) {
            String randomVet = vet().substring(0, 1).toUpperCase() + vet().substring(1) + "?";
            System.out.println(randomVet);
            assertEquals(detect(randomVet), Codewars.detect(randomVet));
        }

        // Random Tests with Question
        for (int j = 1; j <= 50; j++) {
            Random rand = new Random();
            String s = "Can someone explain";
            int ra = 1 + rand.nextInt(20);
            if (ra > 6 && ra < 13) {
                s = s.toUpperCase();
            }

            if (ra >= 13 && ra < 17) {
                s = s.toLowerCase();
            }

            if (ra >= 17) {
                s = s.substring(1);
            }

            String randomVet2 = s + " " + vet() + "?";
            System.out.println(randomVet2);
            assertEquals(detect(randomVet2), Codewars.detect(randomVet2));
        }
    }
}
