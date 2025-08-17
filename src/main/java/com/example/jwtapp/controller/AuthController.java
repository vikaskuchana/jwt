package com.example.jwtapp.controller;

import com.example.jwtapp.model.User;
import com.example.jwtapp.repository.UserRepository;
import com.example.jwtapp.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController//Used instead of @Controller and on each method @ResponseBody is not required
@RequestMapping("/auth")
public class AuthController {
    private AuthenticationManager authManager;

    private JwtUtil jwtUtil;

    private UserRepository repo;

    private PasswordEncoder encoder;

    AuthController(AuthenticationManager authManager,
                   JwtUtil jwtUtil,
                   UserRepository repo,
                   PasswordEncoder encoder){
        this.authManager=authManager;
        this.jwtUtil=jwtUtil;
        this.repo=repo;
        this.encoder=encoder;
    }
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));//encoding the password and storing it in the DB.
        repo.save(user);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        return jwtUtil.generateToken(user.getUsername());
    }
}