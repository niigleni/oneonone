package com.niigle.oneonone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "user_activity")
public class UserActivity {

    @Id
    @Column(name = "user_id")
    private UUID userId;
    @Column(name = "activity_id")
    private UUID acivityId;

    public UserActivity() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getAcivityId() {
        return acivityId;
    }

    public void setAcivityId(UUID acivityId) {
        this.acivityId = acivityId;
    }
}
