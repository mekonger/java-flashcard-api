package com.m3kong.flashcard.dto.request.token;

import java.util.UUID;

public class TokenRefreshRequest {
    private UUID accountId;
    private String accessToken;
    private String refreshToken;
}
