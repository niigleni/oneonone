package com.niigle.oneonone.entity;

import java.util.UUID;

public class Activity {

    private UUID activityId;
    private String activityName;
    private Integer minMatchers;
    private Integer maxMatchers;
    private UUID activitiesId;

    public Activity() {
    }

    public UUID getActivityId() {
        return activityId;
    }

    public void setActivityId(UUID activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getMinMatchers() {
        return minMatchers;
    }

    public void setMinMatchers(Integer minMatchers) {
        this.minMatchers = minMatchers;
    }

    public Integer getMaxMatchers() {
        return maxMatchers;
    }

    public void setMaxMatchers(Integer maxMatchers) {
        this.maxMatchers = maxMatchers;
    }

    public UUID getActivitiesId() {
        return activitiesId;
    }

    public void setActivitiesId(UUID activitiesId) {
        this.activitiesId = activitiesId;
    }
}
