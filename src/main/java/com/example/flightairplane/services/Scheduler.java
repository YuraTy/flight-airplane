package com.example.flightairplane.services;

import com.example.flightairplane.init.DummyAirplane;
import com.example.flightairplane.model.Airplane;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Scheduler {

    private final DummyAirplane dummyAirplane;
    private final PlaneCalculation planeCalculation;

    public Scheduler(DummyAirplane dummyAirplane, PlaneCalculation planeCalculation) {
        this.dummyAirplane = dummyAirplane;
        this.planeCalculation = planeCalculation;
    }

    @Scheduled
    public void init() {
        Airplane airplane = dummyAirplane.getAirplane0();
        planeCalculation.calculateRoute(airplane.getCharacteristics(),airplane.getFlights().get(0).getPoints());
    }
}
