package com.niigle.oneonone.entity;

import java.util.UUID;

public class UserPreferences {

    private UUID userId;
    private Integer maxDistance;

    public UserPreferences() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Integer getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(Integer maxDistance) {
        this.maxDistance = maxDistance;
    }
}
