package com.example.vitebackend.response;

import lombok.Data;

@Data
public abstract class ResponseData {
    protected int code;
    protected String message;
    protected boolean ok;
}
