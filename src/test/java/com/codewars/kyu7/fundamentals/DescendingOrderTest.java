package com.codewars.kyu7.fundamentals;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 01.03.2021
 */
public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(1, DescendingOrder.sortDesc(1));
    }

    @Test
    public void test_03() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test_04() {
        assertEquals(2110, DescendingOrder.sortDesc(1021));
    }

    @Test
    public void test_05() {
        assertEquals(987654321, DescendingOrder.sortDesc(123495678));
    }
}
