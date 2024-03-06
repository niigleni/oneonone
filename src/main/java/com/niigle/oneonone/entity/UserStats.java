package com.niigle.oneonone.entity;

import java.sql.Date;
import java.util.UUID;

public class UserStats {

    private UUID userId;
    private UUID activityId;
    private UUID resultHistoryId;
    private Integer numberOfMatches;
    private boolean fairUser;
    private Date lastMatchDate;

    public UserStats() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getActivityId() {
        return activityId;
    }

    public void setActivityId(UUID activityId) {
        this.activityId = activityId;
    }

    public UUID getResultHistoryId() {
        return resultHistoryId;
    }

    public void setResultHistoryId(UUID resultHistoryId) {
        this.resultHistoryId = resultHistoryId;
    }

    public Integer getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(Integer numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public boolean isFairUser() {
        return fairUser;
    }

    public void setFairUser(boolean fairUser) {
        this.fairUser = fairUser;
    }

    public Date getLastMatchDate() {
        return lastMatchDate;
    }

    public void setLastMatchDate(Date lastMatchDate) {
        this.lastMatchDate = lastMatchDate;
    }
}
