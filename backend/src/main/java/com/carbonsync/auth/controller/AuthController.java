package com.carbonsync.auth.controller;

import com.carbonsync.auth.dto.AuthResponse;
import com.carbonsync.auth.dto.LoginRequest;
import com.carbonsync.auth.dto.SignupRequest;
import com.carbonsync.auth.service.AuthService;
import com.carbonsync.utils.ResponseWrapper;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Exposes POST /api/auth/signup and POST /api/auth/login
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<ResponseWrapper<AuthResponse>> signup(
            @Valid @RequestBody SignupRequest request) {
        return ResponseEntity.ok(ResponseWrapper.success(authService.signup(request)));
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseWrapper<AuthResponse>> login(
            @Valid @RequestBody LoginRequest request) {
        return ResponseEntity.ok(ResponseWrapper.success(authService.login(request)));
    }
}
