package com.codewars.kyu8.fundamentals.youcantcodeunderpressure;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Iuriy Gaydarzhi.
 * @since 24.03.2021
 */
public class JavaTest {

    @Test
    public final void test1() {
        Assert.assertEquals("Nope!", 4, Java.doubleInteger(2));
    }

    @Test
    public final void test2() {
        Assert.assertEquals("Nope!", 8, Java.doubleInteger(4));
    }

    @Test
    public final void test3() {
        Assert.assertEquals("Nope!", -20, Java.doubleInteger(-10));
    }

    @Test
    public final void test4() {
        Assert.assertEquals("0*2 is 0!", 0, Java.doubleInteger(0));
    }

    @Test
    public final void test5() {
        Assert.assertEquals("Nope!", 200, Java.doubleInteger(100));
    }
}
