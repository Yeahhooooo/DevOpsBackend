package com.example.vitebackend.service;

import com.example.vitebackend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User getRegister(String userName,String password);

    User getLogin(String username,String password);

    User getUserInfo(String token);

    List<User> getAllUser();
}
