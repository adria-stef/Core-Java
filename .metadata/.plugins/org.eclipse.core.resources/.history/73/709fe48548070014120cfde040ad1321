package com.hackbulgaria.corejava.missingjoin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MissingJoinTestCase {

    private MissingJoin missingJoin = new MissingJoin();

    @Before
    public void setUp() throws Exception {
        this.missingJoin = new MissingJoin();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void StringTest() {
        assertEquals("bla blah", missingJoin.stichMeUp(" ", "bla", "blah"));
    }
    
    @Test
    public void intTest() {
        int a = 5;
        assertEquals("5 blah", missingJoin.stichMeUp(" ", a, "blah"));
    }
    
    @Test
    public void floatTest() {
        float a = 5.23f;
        assertEquals("5.23 blah", missingJoin.stichMeUp(" ", a, "blah"));
    }
    
    @Test
    public void doubleTest() {
        double a = 5.46d;
        assertEquals("5.46 blah", missingJoin.stichMeUp(" ", a, "blah"));
    }

}
