package com.msready19.raist213;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperUtilitiesTest {

    @Test
    public void doReverse() {
        String source = "abcde";
        String expected = "edcba";
        SuperUtilities r = new SuperUtilities();
        String actual = r.doReverse(source);
        assertEquals(expected, actual);
    }

    @Test
    public void doReverse2() {
        String source = "abcdefg";
        String expected = "gfedcba";
        SuperUtilities r = new SuperUtilities();
        String actual = r.doReverse(source);
        assertEquals(expected, actual);
    }
}
