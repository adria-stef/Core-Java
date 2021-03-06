package com.hackbulgaria.corejava.collections1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckBracketsTestCase {

    private CheckBrackets checkBrackets = new CheckBrackets();
    @Before
    public void setUp() throws Exception {
        this.checkBrackets = new CheckBrackets();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStart() {
        assertTrue(checkBrackets.startsWithOpening("()()"));
        assertFalse(checkBrackets.startsWithOpening(")()"));
    }

    @Test
    public void testEnd() {
        assertTrue(checkBrackets.endsWithClosing("()()"));
        assertFalse(checkBrackets.endsWithClosing(")()("));
    }

    @Test
    public void testNumberOfBrackets() {
        assertTrue(checkBrackets.equalNumberOfBrackets("()()"));
        assertFalse(checkBrackets.equalNumberOfBrackets(")()()"));
    }

    @Test
    public void testIfClosingFirst() {
        assertTrue(checkBrackets.openingFirst("()()("));
        assertFalse(checkBrackets.openingFirst("())()()("));
        assertTrue(checkBrackets.openingFirst("()()()()("));
        assertFalse(checkBrackets.openingFirst("())))()()()("));
        assertTrue(checkBrackets.openingFirst("()()(()("));
        assertFalse(checkBrackets.openingFirst("()())()()("));
    }
    
    @Test
    public void testCheck() {
        assertTrue(checkBrackets.check("(()()()())"));
        assertFalse(checkBrackets.check("(()()()()"));
    }

}
