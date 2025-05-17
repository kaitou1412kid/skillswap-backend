package com.project.skillswapbackend.dto.request;

import lombok.Data;

@Data
// Lombok annotaion not working
public class UserLoginDTO {

    private String username;

    private String password;

}
