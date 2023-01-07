package com.example.flightairplane.services;

import com.example.flightairplane.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PlaneCalculation {

    @Autowired
    private Distances distances;

    public List<TemporaryPoint> calculateRoute(AirplaneCharacteristics characteristics, List<WayPoint> wayPoints) {
        Iterator<WayPoint> wayPointIterator = wayPoints.listIterator();
        List<TemporaryPoint> temporaryPoints = new ArrayList<>();
        while (wayPointIterator.hasNext()){
                temporaryPoints.add(getTempraryPoint(wayPointIterator.next(),wayPointIterator.next(),characteristics));
        }
        return temporaryPoints;
    }

    private TemporaryPoint getTempraryPoint(WayPoint wayPoint0, WayPoint wayPoint1,AirplaneCharacteristics characteristics) {
        double kilometersToPoint = distances.getDistanceBetweenPointsNew(wayPoint0.getLatitude(), wayPoint1.getLongitude(),wayPoint0.getLatitude(), wayPoint1.getLongitude(), "kilometers");
        Integer heightAirplane = wayPoint0.getFlightAltitude();
        for(Double i = kilometersToPoint*1000 ; i <= 0 ; i=i-characteristics.getMaxSpeed()) {
            Integer rateOfChangeOfAltitude = characteristics.getRateOfChangeOfAltitude();
            if (heightAirplane > wayPoint1.getFlightAltitude()){
                heightAirplane = heightAirplane - rateOfChangeOfAltitude;
            }else {
                heightAirplane = heightAirplane + rateOfChangeOfAltitude;
            }
        }
        return new TemporaryPoint(wayPoint1.getLatitude(), wayPoint1.getLongitude(), heightAirplane, wayPoint1.getAirspeed());
    }


    private Airplane simulationFlight(Airplane airplane, WayPoint wayPoint) {
        TemporaryPoint position = airplane.getPosition();
        position.setLatitude(wayPoint.getLatitude());
        position.setLongitude(wayPoint.getLongitude());
        airplane.setPosition(position);
        List<Flight> flights = airplane.getFlights();
        Flight flight = flights.get(0);
        List<TemporaryPoint> temporaryPoints = flight.getPassedPoints();
        temporaryPoints.add(position);
        flight.setPassedPoints(temporaryPoints);
        flights.add(0,flight);
        airplane.setFlights(flights);
        return airplane;
    }




}
