package com.codewars.kyu8.fundamentals.themostaskedquestiononcodewars;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Iuriy Gaydarzhi.
 * @since 14.03.2021
 */
public class CodewarsTest {

    @Test
    public void testSomething() {
        assertTrue(Codewars.detect("Can someone explain to me what this kata is about?"));
        assertFalse(Codewars.detect("Can someone solve this kata for me?"));
        assertFalse(Codewars.detect("can someone explain to me how to enable caps lock/"));

    }
}
