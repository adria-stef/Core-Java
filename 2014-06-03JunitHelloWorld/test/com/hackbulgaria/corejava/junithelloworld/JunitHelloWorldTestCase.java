package com.hackbulgaria.corejava.junithelloworld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.corejava.junithelloworld.JunitHelloWorld;

public class JunitHelloWorldTestCase {

    private JunitHelloWorld junitHelloWorld = new JunitHelloWorld();
    @Before
    public void setUp() throws Exception {
        this.junitHelloWorld = new JunitHelloWorld();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest() {
        int a = 383;
        assertEquals(3, junitHelloWorld.getNumberOfDigits(a));
    }
    
    @Test
    public void singleDigitTest() {
        int a = 3;
        assertEquals(1, junitHelloWorld.getNumberOfDigits(a));
    }
    
    @Test
    public void bigTest() {
        int a = 37_474_883;
        assertEquals(8, junitHelloWorld.getNumberOfDigits(a));
    }
    
    @Test
    public void negativeTest() {
        int a = -42;
        assertEquals(2, junitHelloWorld.getNumberOfDigits(a));
    }

}
