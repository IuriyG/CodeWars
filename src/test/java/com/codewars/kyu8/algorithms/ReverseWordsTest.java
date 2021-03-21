package com.codewars.kyu8.algorithms;

import com.codewars.kyu8.algorithms.reversewords.ReverseWords;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 04.03.2021
 */
public class ReverseWordsTest {

    @Test
    public void testSomething() {
        assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
        assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
        assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
        assertEquals("nice so not is world The", ReverseWords.reverseWords("The world is not so nice"));
        assertEquals("beatiful is Life", ReverseWords.reverseWords("Life is beatiful"));
        assertEquals("won! we hello Hello", ReverseWords.reverseWords("Hello hello we won!"));
    }
}
