package com.hackbulgaria.corejava.exceptions1;

public class SpecialIlligalArgumentException extends IllegalArgumentException {

    private static final long serialVersionUID = -8113973249891112743L;
    
    SpecialIlligalArgumentException () {
        super("The format of the data is not correct. Check your fields.");
    }

}
