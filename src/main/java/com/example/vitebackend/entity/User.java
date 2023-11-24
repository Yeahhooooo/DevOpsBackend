package com.example.vitebackend.entity;


import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class User {

    private String username;
    private String password;
    private String avatar;

    private String desc;

    private String[] roles;

    private String[] buttons;

    private String[] routes;

    private String token;

    public User(String username, String password, String avatar, String desc, String[] roles, String[] buttons, String[] routes, String token) {
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.desc = desc;
        this.roles = roles;
        this.buttons = buttons;
        this.routes = routes;
        this.token = token;
    }

}
