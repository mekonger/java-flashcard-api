package com.m3kong.flashcard.service;

import com.m3kong.flashcard.dto.response.token.TokenResponse;

import java.util.UUID;

public interface TokenService {
    TokenResponse generateToken(UUID id, String email);
    TokenResponse refreshToken(UUID id, String token);
    boolean validateToken(String token);
}
