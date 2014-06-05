package com.hackbulgaria.corejava.oopfun;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PairTestCase {

    private Pair pair = new Pair();
    private Pair secondPair = new Pair();

    @Before
    public void setUp() throws Exception {
        this.pair = new Pair();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEquals() {
        pair.setFirst(3);
        pair.setSecond(2);

        secondPair.setFirst(3);
        secondPair.setSecond(2);

        boolean isTrue = pair.equals(pair, secondPair);

        assertTrue(isTrue);
    }

    @Test
    public void testNotEquals() {
        pair.setFirst(3);
        pair.setSecond(2);

        secondPair.setFirst(3);
        secondPair.setSecond(3);

        boolean isTrue = pair.equals(pair, secondPair);

        assertFalse(isTrue);
    }

    @Test
    public void testToString() {
        pair.setFirst(1);
        pair.setSecond(2);
        assertEquals("(1, 2)", pair.toString());
    }
}
