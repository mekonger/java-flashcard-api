package com.m3kong.flashcard.dto.request.card;

import com.m3kong.flashcard.enums.MarkCardStatus;

import java.util.UUID;

public class CardMarkedRequest {
    private UUID cardId;
    private MarkCardStatus status;
}
