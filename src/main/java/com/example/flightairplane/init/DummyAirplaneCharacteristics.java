package com.example.flightairplane.init;

import com.example.flightairplane.model.AirplaneCharacteristics;
import org.springframework.stereotype.Component;

@Component
public class DummyAirplaneCharacteristics {

    public AirplaneCharacteristics generateAirplaneCharacteristics0() {
        return new AirplaneCharacteristics(100,150,50,3);
    }

    public AirplaneCharacteristics generateAirplaneCharacteristics1() {
        return new AirplaneCharacteristics(150,170,70,4);
    }

    public AirplaneCharacteristics generateAirplaneCharacteristics2() {
        return new AirplaneCharacteristics(200,220,70,5);
    }

}
