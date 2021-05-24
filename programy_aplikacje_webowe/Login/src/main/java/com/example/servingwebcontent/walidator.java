package com.example.servingwebcontent;

public class walidator {
    public static String walidate(String login, String password){
        String status = "Bad data";
        if(login.equals("admin") && password.equals("admin")){
            status = "Logged";
        }
        return status;
    }
}
