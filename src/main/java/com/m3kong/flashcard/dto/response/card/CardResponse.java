package com.m3kong.flashcard.dto.response.card;

import com.m3kong.flashcard.enums.MarkCardStatus;

import java.util.UUID;

public class CardResponse {
    private UUID groupCardId;
    private UUID cardId;
    private String title;
    private String content;
    private MarkCardStatus lastStatus;
}
