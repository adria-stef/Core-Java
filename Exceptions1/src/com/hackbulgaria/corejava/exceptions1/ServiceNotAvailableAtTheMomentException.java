package com.hackbulgaria.corejava.exceptions1;

public class ServiceNotAvailableAtTheMomentException extends Exception {

    private static final long serialVersionUID = -3868547290492936420L;

    ServiceNotAvailableAtTheMomentException() {
        super("Service is not available at the moment. There might be a network problem. Check your hardware devices");
    }
    
}
