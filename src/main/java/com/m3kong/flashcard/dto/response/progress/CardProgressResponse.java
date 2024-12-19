package com.m3kong.flashcard.dto.response.progress;

import java.util.UUID;

public class CardProgressResponse {
    private UUID cardId;
    private int numberOfIgnored;
    private int numberOfSucceed;
    private int numberOfFailure;
}
