package com.niigle.oneonone.entity;

import java.util.UUID;

public class Activities {

    private UUID activitiesId;
    private String ActivityName;

    public Activities() {
    }

    public UUID getActivitiesId() {
        return activitiesId;
    }

    public void setActivitiesId(UUID activitiesId) {
        this.activitiesId = activitiesId;
    }

    public String getActivityName() {
        return ActivityName;
    }

    public void setActivityName(String activityName) {
        ActivityName = activityName;
    }
}
