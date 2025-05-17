package com.project.skillswapbackend.dto.request;

import lombok.Data;

@Data
public class UserRegisterDTO {

    private String name;

    private String email;

    private String password;

    private String username;

    private String phone;

}
