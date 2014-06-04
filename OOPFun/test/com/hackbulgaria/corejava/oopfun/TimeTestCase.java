package com.hackbulgaria.corejava.oopfun;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeTestCase {

    
    @Before
    public void setUp() throws Exception {
 
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
       //constructor
     Time time = new Time(1, 2, 3, 4, 5, 6);

       assertEquals("4:5:6 1.2.3", time.toString());
    }

}
