package com.carbonsync.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// DTO for signup — name, email, password, role
public class SignupRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Must be a valid email")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    // COMPANY | AUDITOR | GOVERNMENT
    @NotBlank(message = "Role is required")
    private String role;

    public SignupRequest() {}

    public String getName()              { return name; }
    public void setName(String name)     { this.name = name; }
    public String getEmail()             { return email; }
    public void setEmail(String email)   { this.email = email; }
    public String getPassword()          { return password; }
    public void setPassword(String pw)   { this.password = pw; }
    public String getRole()              { return role; }
    public void setRole(String role)     { this.role = role; }
}
