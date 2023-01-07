package com.example.flightairplane.services;

import org.springframework.stereotype.Service;

@Service
public class Distances {

    public double getDistanceBetweenPointsNew(double latitude1, double longitude1, double latitude2, double longitude2, String unit) {
        double theta = longitude1 - longitude2;
        double distance = 60 * 1.1515 * (180/Math.PI) * Math.acos(
                Math.sin(latitude1 * (Math.PI/180)) * Math.sin(latitude2 * (Math.PI/180)) +
                        Math.cos(latitude1 * (Math.PI/180)) * Math.cos(latitude2 * (Math.PI/180)) * Math.cos(theta * (Math.PI/180))
        );
        if (unit.equals("miles")) {
            return Math.round(distance);
        } else if (unit.equals("kilometers")) {
            return Math.round(distance * 1.609344);
        } else {
            return 0;
        }
    }
}
