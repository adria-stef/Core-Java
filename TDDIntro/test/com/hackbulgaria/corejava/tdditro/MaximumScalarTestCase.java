package com.hackbulgaria.corejava.tdditro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hacbulgaria.corejava.tddintro.MaximumScalar;

public class MaximumScalarTestCase {

    private MaximumScalar maximumScalar = new MaximumScalar();
    
    @Before
    public void setUp() throws Exception {
        this.maximumScalar = new MaximumScalar();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void standartTest() {
        int [] a = new int[] {1, 2, 3, 4};
        int [] b = new int[] {4, 3, 2, 1};
        
        assertEquals(30, maximumScalar.maxScalarProduct(a, b));
    }
    
    @Test
    public void testWithNegatives() {
        int [] a = new int[] {-4, -3};
        int [] b = new int[] {-5, -3};
        
        assertEquals(29, maximumScalar.maxScalarProduct(a, b));
    }
    
    @Test
    public void testWithZeroes() {
        int [] a = new int[] {0, 4, -1, -3};
        int [] b = new int[] {2, -9, 0, 4};
        
        assertEquals(8, maximumScalar.maxScalarProduct(a, b));
    }

}
