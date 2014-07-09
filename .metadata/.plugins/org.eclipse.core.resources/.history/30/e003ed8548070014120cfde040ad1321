package com.hackbulgaria.corejava.missingjoin;

import java.util.ArrayList;
import java.util.List;

public class MissingJoin {
    // stichMeUp(" ", "Dnes", "vidqh", 5, "hodeshti", "meduzi") =>
    // "Dnes widqh 5 hodeshti maduzi"

    public static Object[] getLongString(Object... arrStrings) {
        for (int i = 0; i < arrStrings.length; i++) {
            if (!(arrStrings[i] instanceof String)) {
                arrStrings[i] = arrStrings[i].toString();
            }

        }
        return arrStrings;
    }

    public static String stichMeUp(String glue, Object... strings) {
        
        Object[] modifiedStrings = MissingJoin.getLongString(strings);
        
        String finalString = "";
        
        for (int i = 0; i < modifiedStrings.length; i++) {
            if(i != modifiedStrings.length - 1){
                finalString += strings[i] + glue;
            } else {
                finalString += strings[i];
            }
        
        }

        return finalString;
    }
}
