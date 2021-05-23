package com.codewars.kyu8.fundamentals.multiplicationtablefornumber;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * @author Iuriy Gaydarzhi.
 * @since 21.05.2021
 */
public class KataTest {

    @Test
    public void basicTests() {
        assertThat(Kata.multiTable(5), is("1 * 5 = 5\n2 * 5 = 10\n3 * 5 = 15\n4 * 5 = 20\n5 * 5 = 25\n6 * 5 = 30\n7 * 5 = 35\n8 * 5 = 40\n9 * 5 = 45\n10 * 5 = 50"));
        assertThat(Kata.multiTable(1), is("1 * 1 = 1\n2 * 1 = 2\n3 * 1 = 3\n4 * 1 = 4\n5 * 1 = 5\n6 * 1 = 6\n7 * 1 = 7\n8 * 1 = 8\n9 * 1 = 9\n10 * 1 = 10"));
    }

    @Test
    public void randomTests() {
        List<Object[]> trials =
                IntStream.rangeClosed(1, 10)
                        .mapToObj(n ->
                                new Object[]{n,
                                        IntStream.rangeClosed(1, 10)
                                                .mapToObj(i -> String.format("%d * %d = %d", i, n, i * n))
                                                .collect(Collectors.joining("\n"))})
                        .collect(Collectors.toList());
        Collections.shuffle(trials, new Random());
        trials.forEach(test -> Kata.multiTable((Integer) test[0]));
    }
}
