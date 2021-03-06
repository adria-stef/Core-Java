package com.hackbulgaria.javacore.exam1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UtilsTestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSort() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);

        
        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(2);
        list2.add(4);
        
        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(2);
        list3.add(6);
        
        List<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(6);
        list4.add(4);
        
        assertEquals(Utils.sort(list2), list1);
        assertEquals(Utils.sort(list3), list1);
        assertEquals(Utils.sort(list4), list1);
    }
    
    @Test
    public void testReverse() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(2);
        list2.add(1);

        Utils.reverse(list2);

        assertEquals(list2, list1);
    }
    
    @Test
    public void testMonotonous() {
        assertTrue(Utils.isMonotonic(Arrays.asList(1,2,3,4,5,6)));
        assertTrue(Utils.isMonotonic(Arrays.asList(6,5,4,3,2,1,1,1)));
        assertFalse(Utils.isMonotonic(Arrays.asList(1,2,1,4,5,4)));
    }

}