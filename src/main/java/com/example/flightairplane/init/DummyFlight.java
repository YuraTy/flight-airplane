package com.example.flightairplane.init;

import com.example.flightairplane.model.Flight;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DummyFlight {

    private final DummyWayPoint dummyWayPoint;

    public DummyFlight(DummyWayPoint dummyWayPoint) {
        this.dummyWayPoint = dummyWayPoint;
    }


    public List<Flight> getFlight0() {
        List<Flight> flightList = new ArrayList<>();
        Flight flight = new Flight(0L,dummyWayPoint.generateWayPoint0(),new ArrayList<>());
        flightList.add(flight);
        return flightList;
    }

    public List<Flight> getFlight1() {
        List<Flight> flightList = new ArrayList<>();
        Flight flight = new Flight(1L,dummyWayPoint.generateWayPoint0(),new ArrayList<>());
        flightList.add(flight);
        return flightList;
    }

    public List<Flight> getFlight2() {
        List<Flight> flightList = new ArrayList<>();
        Flight flight = new Flight(2L,dummyWayPoint.generateWayPoint0(),new ArrayList<>());
        flightList.add(flight);
        return flightList;
    }
}
