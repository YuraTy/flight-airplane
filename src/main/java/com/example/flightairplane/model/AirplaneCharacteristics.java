package com.example.flightairplane.model;

public class AirplaneCharacteristics {
    public AirplaneCharacteristics(Integer maxSpeed, Integer maxAcceleration, Integer rateOfChangeOfAltitude, Integer rateOfChangeOfCourse) {
        this.maxSpeed = maxSpeed;
        this.maxAcceleration = maxAcceleration;
        this.rateOfChangeOfAltitude = rateOfChangeOfAltitude;
        this.rateOfChangeOfCourse = rateOfChangeOfCourse;
    }

    private Integer maxSpeed;

    public Integer maxAcceleration;

    public Integer rateOfChangeOfAltitude;

    private Integer rateOfChangeOfCourse;

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getMaxAcceleration() {
        return maxAcceleration;
    }

    public void setMaxAcceleration(Integer maxAcceleration) {
        this.maxAcceleration = maxAcceleration;
    }

    public Integer getRateOfChangeOfAltitude() {
        return rateOfChangeOfAltitude;
    }

    public void setRateOfChangeOfAltitude(Integer rateOfChangeOfAltitude) {
        this.rateOfChangeOfAltitude = rateOfChangeOfAltitude;
    }

    public Integer getRateOfChangeOfCourse() {
        return rateOfChangeOfCourse;
    }

    public void setRateOfChangeOfCourse(Integer rateOfChangeOfCourse) {
        this.rateOfChangeOfCourse = rateOfChangeOfCourse;
    }
}
