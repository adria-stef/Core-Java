package com.hackbulgaria.corejava.oopfun;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarTestCase {

    private Audi audi = new Audi();
    private Citroen citroen = new Citroen();
    private Peugeot peugeot = new Peugeot();
    private Opel opel = new Opel();
    
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void audiTest() {

        assertEquals("Audi@129129", audi.toString());
        assertEquals("Citroen@q2789", citroen.toString());
        assertEquals("Opel@239820", opel.toString());
        assertEquals("Peugeot@23890", peugeot.toString());
        
    }

}
