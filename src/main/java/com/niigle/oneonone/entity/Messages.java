package com.niigle.oneonone.entity;

import java.sql.Timestamp;
import java.util.UUID;

public class Messages {

    private UUID messageId;
    private Timestamp createdOn;
    private Timestamp modifiedOn;
    private Timestamp deletedOn;
    private String text;
    private UUID userTo;

    public Messages() {
    }

    public UUID getMessageId() {
        return messageId;
    }

    public void setMessageId(UUID messageId) {
        this.messageId = messageId;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Timestamp getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Timestamp deletedOn) {
        this.deletedOn = deletedOn;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UUID getUserTo() {
        return userTo;
    }

    public void setUserTo(UUID userTo) {
        this.userTo = userTo;
    }
}
