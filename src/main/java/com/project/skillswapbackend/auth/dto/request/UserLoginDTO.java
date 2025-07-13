package com.project.skillswapbackend.auth.dto.request;

import lombok.Data;

@Data
public class UserLoginDTO {

    private String username;

    private String password;

}
