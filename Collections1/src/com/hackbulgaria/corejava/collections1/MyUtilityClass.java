package com.hackbulgaria.corejava.collections1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyUtilityClass {

    public static String hashMapToString(HashMap<? extends Object, ? extends Object> hashMap) {
        String humanReadableString = "";

        humanReadableString += "{ ";
        for (Map.Entry<? extends Object, ? extends Object> entry : hashMap.entrySet()) {

            humanReadableString += entry.getKey().toString() + " : " + entry.getValue().toString() + ", ";

        }

        humanReadableString += "}";
        return humanReadableString;

        // Iterator entries = hashMap.entrySet().iterator();
        // if (! (entries.hasNext())) {
        // Entry entry = (Entry) entries.next();
        // humanReadableString += entry.getKey().toString() + " : " +
        // entry.getValue().toString();
        // } else {
        // Entry entry = (Entry) entries.next();
        // humanReadableString += entry.getKey().toString() + " : " +
        // entry.getValue().toString() + ", ";
        // }
        //
        // return humanReadableString;
    }

    public static String linkedHashMapToString(LinkedHashMap<? extends Object, ? extends Object> hashMap) {
        String humanReadableString = "";

        humanReadableString += "{ ";
        for (Map.Entry<? extends Object, ? extends Object> entry : hashMap.entrySet()) {

            humanReadableString += entry.getKey().toString() + " : " + entry.getValue().toString() + ", ";

        }

        humanReadableString += "}";
        return humanReadableString;

    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new LinkedHashMap<>();

        String[] words = text.split(" ");

            for (String word : words) {
                Integer count = 1;
                if (!(map.containsKey(word))) {
                    map.put(word, count);
                } else {
                    count += 1;
                    map.put(word, count);
                }
            }

        return map;
    }

}
