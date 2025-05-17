package com.project.skillswapbackend.service;

import com.project.skillswapbackend.dto.request.UserLoginDTO;
import com.project.skillswapbackend.dto.request.UserRegisterDTO;
import com.project.skillswapbackend.model.User;
import com.project.skillswapbackend.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;


    public User signup(UserRegisterDTO registerDTO){
        User user = new User();

        user.setUsername(registerDTO.getUsername());
        user.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
        user.setEmail(registerDTO.getEmail());
        user.setName(registerDTO.getName());
        user.setPhone(registerDTO.getPhone());

        return userRepository.save(user);

    }

    public User authenticate(UserLoginDTO loginDTO){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDTO.getUsername(),
                        loginDTO.getPassword()
                )
        );
        return userRepository.findByUsername(loginDTO.getUsername()).orElseThrow();
    }
}
