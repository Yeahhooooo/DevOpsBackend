package com.example.vitebackend.utils;

import java.util.Date;

public class Token {
    public static String generateToken(String username, String password){
        StringBuilder token = new StringBuilder();
        token.append(username).append(new Date()).append(password);
        return token.toString();
    }
}
