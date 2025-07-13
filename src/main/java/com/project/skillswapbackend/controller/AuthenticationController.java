package com.project.skillswapbackend.controller;

import com.project.skillswapbackend.auth.dto.request.UserLoginDTO;
import com.project.skillswapbackend.auth.dto.request.UserRegisterDTO;
import com.project.skillswapbackend.auth.dto.response.LoginResponse;
import com.project.skillswapbackend.model.User;
import com.project.skillswapbackend.auth.service.AuthenticationService;
import com.project.skillswapbackend.auth.service.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private final JwtService jwtService;

    private final AuthenticationService authenticationService;

    public AuthenticationController(final JwtService jwtService, final AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> registerUser(@RequestBody UserRegisterDTO registerDTO) {
        User registeredUser = authenticationService.signup(registerDTO);

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody UserLoginDTO loginDTO) {
        User authenticatedUser = authenticationService.authenticate(loginDTO);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = new LoginResponse();

        loginResponse.setToken(jwtToken);
        loginResponse.setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(loginResponse);
    }
}
