package com.hackbulgaria.corejava.exceptions1;

public class DatabaseCorruptedException extends RuntimeException {

    private static final long serialVersionUID = 1734716476313885001L;

    public DatabaseCorruptedException() {
        super("We have a database corruption. The objet has an unacceptable username");
    }

}
