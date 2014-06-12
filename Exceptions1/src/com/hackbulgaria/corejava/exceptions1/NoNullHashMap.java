package com.hackbulgaria.corejava.exceptions1;

import java.awt.geom.NoninvertibleTransformException;
import java.util.HashMap;

public class NoNullHashMap<K, V> extends HashMap<K, V> {

    // by default == final????
    private boolean nullsAllowed = false;

    public NoNullHashMap(boolean nullsAllowed) {
        this.nullsAllowed = nullsAllowed;
    }

    @Override
    public V put(K key, V value) {

        if (nullsAllowed == false) {
            if (key == null || value == null) {
                throw new NoNullsException();
            } else {
                return super.put(key, value);
            }
        } else {
            return super.put(key, value);
        }

    }

    @Override
    public V get(Object key) {

        if (nullsAllowed == false) {
            if (key == null) {
                throw new NoNullsException();
            } else {
                return super.get(key);
            }
        } else {
            return super.get(key);
        }
    }
    
    
    public static void main(String[] args) {
        NoNullHashMap<String, Integer> testHashMap = new NoNullHashMap<>(false);
        testHashMap.put(null, 2);
    }
}
