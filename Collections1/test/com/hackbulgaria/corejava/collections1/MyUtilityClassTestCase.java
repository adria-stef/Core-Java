package com.hackbulgaria.corejava.collections1;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyUtilityClassTestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testHashMapToString() {
        
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        hashMap.put(1, "Adii");
        hashMap.put(2, "Super");
        
        String readable = MyUtilityClass.hashMapToString(hashMap);
        assertEquals("{ 1 : Adii, 2 : Super, }", readable);
    }
    
    @Test
    public void linkedHashMapToString() {
        
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        
        linkedHashMap.put(1, "Adii");
        linkedHashMap.put(2, "Super");
        
        String readable = MyUtilityClass.linkedHashMapToString(linkedHashMap);
        assertEquals("{ 1 : Adii, 2 : Super, }", readable);
    }
    
    @Test
    public void testCountWords() {
        
        Map<String, Integer> map = new HashMap<>();
        String testableString = "Ninjas are all over the place! We are all going to die!";
        
        map = MyUtilityClass.countWords(testableString);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.putAll(map);
        String readable = MyUtilityClass.linkedHashMapToString(linkedHashMap);
        assertEquals("{ Ninjas : 1, are : 2, all : 2, over : 1, the : 1, place! : 1, We : 1, going : 1, to : 1, die! : 1, }", readable);
    }

}
