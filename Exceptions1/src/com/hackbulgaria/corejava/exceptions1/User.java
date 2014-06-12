package com.hackbulgaria.corejava.exceptions1;

public class User {

    public User() {
        super();
    }

    
    private static String username;

    public static boolean someMethod(String username) {
        throw new DatabaseCorruptedException();
    }

    public void useService(String name) throws ServiceNotAvailableAtTheMomentException {

        throw new ServiceNotAvailableAtTheMomentException();

    }

    public void tryMethod() {
        try {
            this.useService("shk");
        } catch (ServiceNotAvailableAtTheMomentException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        someMethod(username);
        User user = new User();
        try {
            user.useService("sjdas");
        } catch (ServiceNotAvailableAtTheMomentException e) {
            e.printStackTrace();
        }
    }

}