package com.m3kong.flashcard.dto.response.token;

import java.util.UUID;

public class TokenResponse {
    private UUID accountId;
    private String accessToken;
    private String refreshToken;
    private long expiredTime;
}
