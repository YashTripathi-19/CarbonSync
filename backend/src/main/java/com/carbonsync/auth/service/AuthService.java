package com.carbonsync.auth.service;

import com.carbonsync.auth.dto.AuthResponse;
import com.carbonsync.auth.dto.LoginRequest;
import com.carbonsync.auth.dto.SignupRequest;
import org.springframework.stereotype.Service;

// Stub auth service — returns a fake token until JWT is wired
@Service
public class AuthService {

    private static final String STUB_TOKEN = "stub-jwt-token";

    public AuthResponse login(LoginRequest request) {
        // TODO: validate credentials against DB, generate real JWT
        return new AuthResponse(STUB_TOKEN, request.getEmail(), "COMPANY");
    }

    public AuthResponse signup(SignupRequest request) {
        // TODO: hash password, persist user, generate real JWT
        return new AuthResponse(STUB_TOKEN, request.getEmail(), request.getRole());
    }
}
