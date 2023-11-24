package com.example.vitebackend.controller;

import com.example.vitebackend.entity.User;
import com.example.vitebackend.request.UserLoginRequest;
import com.example.vitebackend.response.ResponseData;
import com.example.vitebackend.response.User.AllUserResponseData;
import com.example.vitebackend.response.User.UserResponseData;
import com.example.vitebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseData register(@RequestBody UserLoginRequest userLoginRequest){
        return new UserResponseData(200,
                "注册成功",
                true,
                userService.getRegister(userLoginRequest.getUsername(),userLoginRequest.getPassword()));
    }

    @PostMapping("/login")
    public ResponseData login(@RequestBody UserLoginRequest userLoginRequest){

        User user = userService.getLogin(userLoginRequest.getUsername(),userLoginRequest.getPassword());
        if(user != null){
            return new UserResponseData(200,
                    "登陆成功",
                    true,
                    user);
        } else {
            return new UserResponseData(201,
                    "用户名或密码错误",
                    false,
                    null);
        }
    }


    @GetMapping("/info")
    public ResponseData getUserInfo(@RequestHeader("Token") String token){
        return new UserResponseData(200,
                "获取成功",
                true,
                userService.getUserInfo(token));
    }

    @GetMapping("/list")
    public ResponseData getAllUsers(){
        return new AllUserResponseData(200,
                "获取成功",
                true,
                userService.getAllUser());
    }

    @PostMapping("/logout")
    public ResponseData logout(){
        return new UserResponseData(200,"登出成功",true,null);
    }
}
