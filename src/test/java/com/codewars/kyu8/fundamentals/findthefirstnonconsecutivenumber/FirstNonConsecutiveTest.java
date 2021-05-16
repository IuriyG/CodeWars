package com.codewars.kyu8.fundamentals.findthefirstnonconsecutivenumber;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Iuriy Gaydarzhi.
 * @since 13.05.2021
 */
public class FirstNonConsecutiveTest {

    private static Integer kata(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                return array[i];
            }
        }
        return null;
    }

    @Test
    public void basicTests() {
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertNull(FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), FirstNonConsecutive.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertNull(FirstNonConsecutive.find(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), FirstNonConsecutive.find(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), FirstNonConsecutive.find(new int[]{-5, -4, -3, -1}));
    }

    @Test
    public void randomTests() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int length = random.nextInt(15) + 1;
            int[] array = new int[length];
            int start = random.nextInt(10000) - (10000 / 4); //25% should start less than zero
            for (int j = 0; j < length; j++) {
                array[j] = start;
                start++;
                if (random.nextInt(100) > 90) {
                    start++;
                }
            }
            assertEquals("For input \"" + Arrays.toString(array) + '"', kata(array), FirstNonConsecutive.find(array));
        }
    }
}