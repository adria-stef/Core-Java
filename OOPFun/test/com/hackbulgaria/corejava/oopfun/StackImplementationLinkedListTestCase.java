package com.hackbulgaria.corejava.oopfun;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackImplementationLinkedListTestCase {

    private StackImplementationLinkedList<Object> stack = new StackImplementationLinkedList<>();

    @Before
    public void setUp() throws Exception {
        this.stack = new StackImplementationLinkedList<>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPush() {
        stack.push(3);
        stack.push(4);
        assertEquals(2, stack.length());
        assertEquals(4, stack.peek());
    }

    @Test
    public void testPop() {

        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        assertEquals(4, stack.peek());

    }

    @Test
    public void testPeek() {
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.peek());

    }

    @Test
    public void testClear() {
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.clear();
        assertEquals(0, stack.length());
    }

    @Test
    public void testLenght() {
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(3, stack.length());
    }

    @Test
    public void testIsEmpty() {
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertFalse(stack.isEmpty());
        stack.clear();
        assertTrue(stack.isEmpty());
    }
}
