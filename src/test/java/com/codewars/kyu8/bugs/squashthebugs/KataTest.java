package com.codewars.kyu8.bugs.squashthebugs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 13.03.2021
 */
public class KataTest {

    // Expected result (for the random test cases)
    private int expected(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i=0; i<spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }

    @Test
    public void basicTests() {

        // assertEquals("expected", "actual");
        assertEquals(7, Kata.findLongest("The quick white fox jumped around the massive dog"));
        assertEquals(10, Kata.findLongest("Take me to tinseltown with you"));
        assertEquals(7, Kata.findLongest("Sausage chops"));
        assertEquals(6, Kata.findLongest("Wind your body and wiggle your belly"));
        assertEquals(7, Kata.findLongest("Lets all go on holiday"));
    }

    private final static String NAMES[] = new String[] {
            "Arsene", "Lupin", "III", "Daisuke", "Jigen", "Goemon", "Ishikawa", "Fujiko", "Mine", "Rebecca",
            "Rossellini", "Koichi", "Zenigata", "Justin", "Nix", "Person", "Leonardo", "Da", "Vinci"
    };

    @Test
    public void  randomTests() {
        for (int i=0; i<40; i++) {
            final int len = (int)(Math.random()*20)+1;
            final String s[] = new String[len];
            for (int k=0; k<len; k++) {
                s[k] = KataTest.NAMES[(int)(Math.random() * NAMES.length)];
            }
            final String str = String.join(" ", s);
            System.out.println("Testing for "+str);
            // assertEquals("expected", "actual");
            assertEquals(expected(str), Kata.findLongest(str));
        }
    }
}
