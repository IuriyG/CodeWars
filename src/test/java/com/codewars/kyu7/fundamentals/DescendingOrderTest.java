package com.codewars.kyu7.fundamentals;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Iuriy Gaydarzhi.
 * @since 01.03.2021
 */
public class DescendingOrderTest {

    @Test
    public void test01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }


    @Test
    public void test03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}