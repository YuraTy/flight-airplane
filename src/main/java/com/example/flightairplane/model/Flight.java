package com.example.flightairplane.model;

import java.util.List;

public class Flight {

    public Flight(Long number, List<WayPoint> points, List<TemporaryPoint> passedPoints) {
        this.number = number;
        this.points = points;
        this.passedPoints = passedPoints;
    }

    private Long number;

    private List<WayPoint> points;

    private List<TemporaryPoint> passedPoints;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public List<WayPoint> getPoints() {
        return points;
    }

    public void setPoints(List<WayPoint> points) {
        this.points = points;
    }

    public List<TemporaryPoint> getPassedPoints() {
        return passedPoints;
    }

    public void setPassedPoints(List<TemporaryPoint> passedPoints) {
        this.passedPoints = passedPoints;
    }
}
