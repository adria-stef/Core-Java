package com.hackbulgaria.corejava.oopfun;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DoublyLinkedListTestCase {

    private DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    @Before
    public void setUp() throws Exception {
        this.doublyLinkedList = new DoublyLinkedList();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIsEmpty() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        assertTrue(doublyLinkedList.isEmpty());
    }
    
    @Test
    public void testSize() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        assertEquals(0, doublyLinkedList.size());
        
        doublyLinkedList.addFirst(3);
        doublyLinkedList.addLast(4);
        doublyLinkedList.addLast(1);
        assertEquals(3, doublyLinkedList.size());
        
        doublyLinkedList.removeFirst();
        assertEquals(2, doublyLinkedList.size());

        doublyLinkedList.removeLast();
        assertEquals(1, doublyLinkedList.size());
        
        
    }
    
    @Test
    public void testGetFirstLast() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        assertEquals(0, doublyLinkedList.size());
        
        doublyLinkedList.addFirst(3);
        doublyLinkedList.addLast(4);
        assertEquals(3, doublyLinkedList.getFirst());
        assertEquals(4, doublyLinkedList.getLast());
        
    }
    
    
    @Test
    public void testRemove() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        assertEquals(0, doublyLinkedList.size());
        
        doublyLinkedList.addFirst(3);
        doublyLinkedList.addFirst(4);
        doublyLinkedList.addFirst(5);
        doublyLinkedList.addFirst(6);
        doublyLinkedList.addLast(2);
        doublyLinkedList.addLast(1);
        doublyLinkedList.addLast(7);
        doublyLinkedList.removeLast();
        doublyLinkedList.removeFirst();
        assertEquals(5, doublyLinkedList.size());
        assertEquals(5, doublyLinkedList.getFirst());
        assertEquals(1, doublyLinkedList.getLast());

    }
    
    @Test
    public void testGetByIndex() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        assertEquals(0, doublyLinkedList.size());
        //523416
        doublyLinkedList.addFirst(3);
        doublyLinkedList.addLast(4);
        doublyLinkedList.addFirst(2);
        doublyLinkedList.addLast(1);
        doublyLinkedList.addFirst(5);
        doublyLinkedList.addLast(6);
        assertEquals(5, doublyLinkedList.getFirst());
        assertEquals(6, doublyLinkedList.getLast());
        
        doublyLinkedList.removeLast();
        doublyLinkedList.removeFirst();
        assertEquals(1, doublyLinkedList.getLast());
        assertEquals(2, doublyLinkedList.getFirst());
        
    }
    


}
