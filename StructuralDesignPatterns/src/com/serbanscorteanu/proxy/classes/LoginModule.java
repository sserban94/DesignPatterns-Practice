package com.serbanscorteanu.proxy.classes;

public class LoginModule implements LoginInterface {
    @Override
    public boolean checkCredentials(String username, String password) {
        System.out.println("Connecting..");
        System.out.println("Checking credentials...");
        if (username.equals("admin") && password.equals("1234")){
            return true;
        } else {
            return false;
        }
    }
}
