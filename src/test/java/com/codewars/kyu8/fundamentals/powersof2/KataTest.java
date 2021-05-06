package com.codewars.kyu8.fundamentals.powersof2;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 06.05.2021
 */
public class KataTest {

    @Test
    public void fixedTests() {

        assertArrayEquals("Invalid answer for n=0", new long[]{1}, Kata.powersOfTwo(0));
        assertArrayEquals("Invalid answer for n=1", new long[]{1, 2}, Kata.powersOfTwo(1));
        assertArrayEquals("Invalid answer for n=4", new long[]{1, 2, 4, 8, 16}, Kata.powersOfTwo(4));

    }

    @Test
    public void randomTests() {

        long[] ref = LongStream.iterate(1, n -> n << 1).limit(64).toArray();

        List<Integer> inputs = IntStream.range(0, 125).map(n -> n / 2).boxed().collect(Collectors.toList());
        Collections.shuffle(inputs);

        for (Integer input : inputs) {
            long[] expected = LongStream.of(ref).limit(input + 1).toArray();
            assertArrayEquals("Invalid answer for n=" + input, expected, Kata.powersOfTwo(input));
        }
    }
}
