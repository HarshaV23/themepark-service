package com.example.themeparkapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Themepark {
    @Id
    @Column(name="ride_id")
    private String rideId;
    @Column(name = "ride_name")
    private String rideName;
    @Column(name = "ride_rating")
    private Integer rideRating;
    @Column(name = "vomit_factor")
    private Integer vomitFactor;

    public Themepark() {
    }

    public Themepark(String rideId, String rideName, Integer rideRating, Integer vomitFactor) {
        this.rideId = rideId;
        this.rideName = rideName;
        this.rideRating = rideRating;
        this.vomitFactor = vomitFactor;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public Integer getRideRating() {
        return rideRating;
    }

    public void setRideRating(Integer rideRating) {
        this.rideRating = rideRating;
    }

    public Integer getVomitFactor() {
        return vomitFactor;
    }

    public void setVomitFactor(Integer vomitFactor) {
        this.vomitFactor = vomitFactor;
    }
}
