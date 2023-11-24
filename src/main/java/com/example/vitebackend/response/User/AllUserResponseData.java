package com.example.vitebackend.response.User;

import com.example.vitebackend.entity.User;
import com.example.vitebackend.response.ResponseData;
import lombok.Data;

import java.util.List;

@Data
public class AllUserResponseData extends ResponseData {

    private List<User> data;

    public AllUserResponseData(int code,String message,boolean ok,List<User> data) {
        this.code = code;
        this.message = message;
        this.ok = ok;
        this.data = data;
    }
}
