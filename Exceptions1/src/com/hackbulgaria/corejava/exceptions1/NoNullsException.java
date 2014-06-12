package com.hackbulgaria.corejava.exceptions1;

public class NoNullsException extends RuntimeException{
    
    public NoNullsException() {
     super("Null key or object. Redefine!");
    }

}
