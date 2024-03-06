package com.niigle.oneonone.entity;

import java.util.UUID;

public class UserMessages {

    private UUID userId;
    private UUID messageId;

    public UserMessages() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getMessageId() {
        return messageId;
    }

    public void setMessageId(UUID messageId) {
        this.messageId = messageId;
    }
}
