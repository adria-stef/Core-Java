package com.hackbulgaria.corejava.collections1;

import java.util.ArrayDeque;
import java.util.Iterator;

public class BoundedQueue<Integer> extends ArrayDeque<Integer> {

    private int maxElements;

    public BoundedQueue(int maxElements) {
        this.maxElements = maxElements;
    }

    @Override
    public boolean offer(Integer e) {

        if (this.size() < maxElements) {
            super.offer(e);
            return true;
        } else {
            this.poll();
            super.offer(e);
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof BoundedQueue) {
            BoundedQueue<Integer> boundedQueue = (BoundedQueue) obj;
            Iterator<Integer> iteratorOne = boundedQueue.iterator();
            Iterator<Integer> iteratorTwo = this.iterator();

            if (boundedQueue.size() != this.size()) {
                return false;
            }

            while (iteratorOne.hasNext()) {
                Integer elementOne = iteratorOne.next();
                Integer elementTwo = iteratorTwo.next();
                if (elementOne.equals(elementTwo)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
