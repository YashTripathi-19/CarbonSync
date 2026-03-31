package com.carbonsync.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

// Permissive security config — JWT filter goes here when auth is wired
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()
                // TODO: replace with role-based rules once JWT is wired:
                // .requestMatchers("/api/auth/**").permitAll()
                // .requestMatchers("/api/government/**").hasRole("GOVERNMENT")
                // .anyRequest().authenticated()
            );
        return http.build();
    }
}
