package com.hackbulgaria.javacore.networking1;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;

public class FindReachables {
    // just not on windows :D

    public static void findReachables() throws UnknownHostException, IOException {
        String networkIp = FindMyOwnIp.getIp().toString();
        int lastIndexOfDot = networkIp.lastIndexOf('.');
        networkIp = networkIp.substring(1, lastIndexOfDot);

        for (int i = 0; i < 256; i++) {
            networkIp = networkIp + "." + i;
            if (Inet4Address.getByName(networkIp).isReachable(50)) {
                System.out.println(Inet4Address.getByName(networkIp));
            }
            int lastIndexOfTheDot = networkIp.lastIndexOf('.');
            networkIp = networkIp.substring(0, lastIndexOfTheDot);
        }
    }

    public static void main(String[] args) throws UnknownHostException, IOException {
        findReachables();
        boolean reachable = Inet4Address.getByName("192.168.1.7").isReachable(50);
        System.out.println(reachable);
    }
}
