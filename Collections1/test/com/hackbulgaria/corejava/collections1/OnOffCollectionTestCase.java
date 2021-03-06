package com.hackbulgaria.corejava.collections1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OnOffCollectionTestCase {

    private OnOffCollection<Integer> onOffCollection = new OnOffCollection<>();

    @Before
    public void setUp() throws Exception {
        this.onOffCollection = new OnOffCollection<>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testOn() {

        Collection<Integer> set = new OnOffCollection<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        assertFalse(set.contains(3));
    }
    
    @Test
    public void testOff() {

        Collection<Integer> set = new OnOffCollection<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        assertTrue(set.contains(4));
    }

}
