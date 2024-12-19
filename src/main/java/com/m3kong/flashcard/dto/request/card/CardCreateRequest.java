package com.m3kong.flashcard.dto.request.card;

import java.util.List;
import java.util.UUID;

public class CardCreateRequest {
    private UUID groupCardId;
    private String title;
    private String content;
    private List<String> keywords;
}
