package com.hackbulgaria.corejava.collections1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoundedQueueTestCase {

     private BoundedQueue<Integer> boundedQueueFirst = new BoundedQueue<>(3);
     private BoundedQueue<Integer> boundedQueueSecond = new BoundedQueue<>(3);

    @Before
    public void setUp() throws Exception {
         this.boundedQueueFirst = new BoundedQueue<>(3);
         this.boundedQueueSecond = new BoundedQueue<>(3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        
        boundedQueueFirst.offer(1);
        boundedQueueFirst.offer(2);
        boundedQueueFirst.offer(3);
        boundedQueueFirst.offer(4);
        boundedQueueFirst.offer(5);
        boundedQueueFirst.offer(6);

        boundedQueueSecond.offer(4);
        boundedQueueSecond.offer(5);
        boundedQueueSecond.offer(6);

        assertEquals(boundedQueueFirst, boundedQueueSecond);
    }

}
