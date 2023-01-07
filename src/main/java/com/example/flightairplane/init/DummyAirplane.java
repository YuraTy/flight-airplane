package com.example.flightairplane.init;

import com.example.flightairplane.model.Airplane;
import com.example.flightairplane.model.TemporaryPoint;
import com.example.flightairplane.model.WayPoint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class DummyAirplane {

    private final DummyAirplaneCharacteristics dummyAirplaneCharacteristics;
    private final DummyWayPoint dummyWayPoint;
    private final DummyFlight dummyFlight;

    public DummyAirplane(DummyAirplaneCharacteristics dummyAirplaneCharacteristics, DummyWayPoint dummyWayPoint, DummyFlight dummyFlight) {
        this.dummyAirplaneCharacteristics = dummyAirplaneCharacteristics;
        this.dummyWayPoint = dummyWayPoint;
        this.dummyFlight = dummyFlight;
    }

    public Airplane getAirplane0() {
        WayPoint wayPoint = dummyWayPoint.generateWayPoint0().get(0);
        return new Airplane(0L,dummyAirplaneCharacteristics.generateAirplaneCharacteristics0(),new TemporaryPoint(wayPoint.getLatitude(), wayPoint.getLongitude(), wayPoint.getFlightAltitude(), wayPoint.getAirspeed()),dummyFlight.getFlight0());
    }
}
