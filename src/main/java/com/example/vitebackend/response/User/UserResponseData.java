package com.example.vitebackend.response.User;

import com.example.vitebackend.entity.User;
import com.example.vitebackend.response.ResponseData;
import lombok.Data;

@Data
public class UserResponseData extends ResponseData {
    private User data;

    public UserResponseData(int code,String message,boolean ok,User user){
        this.code = code;
        this.message = message;
        this.ok = ok;
        this.data = user;
    }
}
