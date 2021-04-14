package com.codewars.kyu8.fundamentals.abbreviatetwowords;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 14.04.2021
 */
public class AbbreviateTwoWordsTest {

    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Fenian"));
        assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Faouzi"));
        assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mediate"));
        assertEquals("Z.K", AbbreviateTwoWords.abbrevName("Zenon Kaput"));

        assertEquals("G.C", AbbreviateTwoWords.abbrevName("george clooney"));
        assertEquals("M.M", AbbreviateTwoWords.abbrevName("mark mark"));
        assertEquals("E.D", AbbreviateTwoWords.abbrevName("eliza doolittle"));
        assertEquals("R.W", AbbreviateTwoWords.abbrevName("reese witherspoon"));
    }

    @Test
    public void testRandom() {
        for (int i = 0; i < 200; i++) {
            String testString = makeString();
            assertEquals(randomTest(testString), AbbreviateTwoWords.abbrevName(testString));
        }
    }

    private String makeString() {
        return makeWord(1, 20) + " " + makeWord(1, 20);
    }

    private String makeWord(int min, int max) {
        String word = "";
        String[] possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split("");
        int length = (int) (Math.random() * max) + min;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * possible.length);
            word += possible[index];
        }

        return word;
    }

    private String randomTest(String name) {
        String[] nameSplit = name.toUpperCase().split(" ");
        return nameSplit[0].substring(0, 1) + '.' + nameSplit[1].charAt(0);
    }
}
