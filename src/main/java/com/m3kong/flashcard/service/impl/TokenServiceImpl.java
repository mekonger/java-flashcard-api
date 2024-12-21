package com.m3kong.flashcard.service.impl;

import com.m3kong.flashcard.dto.response.token.TokenResponse;
import com.m3kong.flashcard.repository.TokenRepository;
import com.m3kong.flashcard.service.TokenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class TokenServiceImpl implements TokenService {

    private TokenRepository tokenRepository;

    @Override
    public TokenResponse generateToken(UUID id, String email) {
        return null;
    }

    @Override
    public TokenResponse refreshToken(UUID id, String token) {
        return null;
    }

    @Override
    public boolean validateToken(String token) {
        return false;
    }
}
