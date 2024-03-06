package com.niigle.oneonone.entity;

import java.util.UUID;

public class UserRanking {

    private UUID userId;
    private UUID rankId;
    private Float points;

    public UserRanking() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getRankId() {
        return rankId;
    }

    public void setRankId(UUID rankId) {
        this.rankId = rankId;
    }

    public Float getPoints() {
        return points;
    }

    public void setPoints(Float points) {
        this.points = points;
    }
}
