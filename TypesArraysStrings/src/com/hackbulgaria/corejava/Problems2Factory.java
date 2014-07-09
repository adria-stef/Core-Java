package com.hackbulgaria.corejava;


public class Problems2Factory {
    public static Problems2 createProblems2Instance() {
        //iska se da wyrnem Problems2impl 
        return new Problems2Impl();
    }
}
