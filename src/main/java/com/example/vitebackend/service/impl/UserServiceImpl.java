package com.example.vitebackend.service.impl;

import com.example.vitebackend.entity.User;
import com.example.vitebackend.repository.UserRepository;
import com.example.vitebackend.service.UserService;
import com.example.vitebackend.utils.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getRegister(String userName,String password) {
        userRepository.save(
                new User(
                    userName,
                    password,
                    "https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png",
                    "",
                    new String[]{},
                    new String[]{},
                    new String[]{},
                    Token.generateToken(userName,password)
                ));
        return userRepository.findByUsername(userName);
    }

    @Override
    public User getLogin(String username,String password) {
        User user = userRepository.findByUsername(username);
        if(user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

    @Override
    public User getUserInfo(String token) {
        return userRepository.findByToken(token);
    }

    @Override
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }
}
