package com.project.skillswapbackend.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class LoginResponse {

    private String token;

    private long expiresIn;
    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }


    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }
}
