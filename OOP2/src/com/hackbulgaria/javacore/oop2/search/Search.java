package com.hackbulgaria.javacore.oop2.search;


public class Search {

    // public static List<String> search(String needle, List<String> haystack) {
    //
    // }

    private static int setPriority(String needle, String haystackMember) {
        if (needle.equals(haystackMember)) {
            return 1;
        }
        if (haystackMember.startsWith(needle)) {
            return 2;
        }
        if (haystackMember.contains(needle)) {
            return 3;
        }
        // to be continued
        // if(haystackMember)

        return 0;
    }
}
