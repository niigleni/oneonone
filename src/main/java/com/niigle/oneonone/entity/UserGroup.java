package com.niigle.oneonone.entity;

import java.util.UUID;

public class UserGroup {

    private UUID userId;
    private UUID groupId;

    public UserGroup() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getGroupId() {
        return groupId;
    }

    public void setGroupId(UUID groupId) {
        this.groupId = groupId;
    }
}
