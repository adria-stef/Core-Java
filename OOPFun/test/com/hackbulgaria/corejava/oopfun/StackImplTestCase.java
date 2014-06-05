package com.hackbulgaria.corejava.oopfun;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackImplTestCase {

    private StackImpl stack = new StackImpl();

    @Before
    public void setUp() throws Exception {
        this.stack = new StackImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEmpty() {

        StackImpl<Object> stack = new StackImpl<Object>();
        stack = new StackImpl<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(4);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testStackPeek() {
        
        StackImpl<Object> stack = new StackImpl<Object>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(4);

        assertEquals(4, stack.peek());
    }

    @Test
    public void testStackPop() {
        StackImpl<Object> stack = new StackImpl<Object>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(4);

        stack.pop();
        assertEquals(3, stack.peek());
    }
    
    @Test
    public void testStackClear() {
        StackImpl<Object> stack = new StackImpl<Object>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(4);

        stack.clear();
        assertTrue(stack.isEmpty());
    }

}