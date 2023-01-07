package com.example.flightairplane.model;

public class WayPoint {

    public WayPoint(Double latitude, Double longitude, Integer flightAltitude, Integer airspeed) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.flightAltitude = flightAltitude;
        this.airspeed = airspeed;
    }

    private Double latitude;
    private Double longitude;
    private Integer flightAltitude;
    private Integer airspeed;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(Integer flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public Integer getAirspeed() {
        return airspeed;
    }

    public void setAirspeed(Integer airspeed) {
        this.airspeed = airspeed;
    }
}
