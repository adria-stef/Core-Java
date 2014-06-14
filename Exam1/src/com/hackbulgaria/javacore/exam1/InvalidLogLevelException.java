package com.hackbulgaria.javacore.exam1;

public class InvalidLogLevelException extends RuntimeException {

    private static final long serialVersionUID = -6214600787054384222L;

    public InvalidLogLevelException() {
        super("This Logger does not allow LEVEL under 0. Redifine level!");
    }
}
