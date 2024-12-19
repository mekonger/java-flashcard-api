package com.m3kong.flashcard.dto.response.groupcard;

import java.util.UUID;

public class GroupCardResponse {
    private UUID groupCardId;
    private UUID parentGroupId;
    private String title;
    private String content;
    private int numberOfCards;
}
