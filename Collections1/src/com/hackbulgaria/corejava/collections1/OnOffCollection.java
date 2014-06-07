package com.hackbulgaria.corejava.collections1;

import java.util.Collection;
import java.util.TreeSet;

public class OnOffCollection<Integer> extends TreeSet<Integer> {

    private static final long serialVersionUID = -1956557638457516171L;
    

    @Override
    public boolean add(Integer i) {

       // boolean isContaining = super.contains(i);
        
        if (this.contains(i)) {
            
            super.remove(i);
            return false;
            
        } else {
            
            super.add(i);
            return true;
            
        }

    }
}
