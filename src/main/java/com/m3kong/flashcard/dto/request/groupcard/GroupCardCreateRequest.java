package com.m3kong.flashcard.dto.request.groupcard;

import java.util.UUID;

public class GroupCardCreateRequest {
    private UUID parentGroupId;
    private String title;
    private String content;
}
