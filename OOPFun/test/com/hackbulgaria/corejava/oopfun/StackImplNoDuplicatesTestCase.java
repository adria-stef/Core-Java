package com.hackbulgaria.corejava.oopfun;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackImplNoDuplicatesTestCase {
    
    private StackImplNoDuplicates stack = new StackImplNoDuplicates();
    
    @Before
    public void setUp() throws Exception {
        this.stack = new StackImplNoDuplicates();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDuplicates() {

        StackImpl<Object> stack = new StackImpl<Object>();
        stack = new StackImpl<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(4);
        stack.push(3);
        
        assertEquals(4, stack.peek());

    }
    
    @Test
    public void testToString () {
        StackImpl<Object> stack = new StackImpl<Object>();
        stack = new StackImpl<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        assertEquals("1 2 3 4", stack.toString());
        
    }

}
