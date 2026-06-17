package com.example.UserRegistelogin.DTOS;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthenticationResponse {
    private String token;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}