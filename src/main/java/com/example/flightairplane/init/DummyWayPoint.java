package com.example.flightairplane.init;

import com.example.flightairplane.model.WayPoint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DummyWayPoint {

    public List<WayPoint> generateWayPoint0() {
        WayPoint wayPoint0 = new WayPoint(55.751322,37.617592,1000,10);
        WayPoint wayPoint1 = new WayPoint(54.751222,31.617592,1000,10);
        WayPoint wayPoint2 = new WayPoint(56.451122,40.647592,1000,10);
        List<WayPoint> testWayPoint = new ArrayList<>();
        testWayPoint.add(wayPoint0);
        testWayPoint.add(wayPoint1);
        testWayPoint.add(wayPoint2);
        return testWayPoint;
    }

    public List<WayPoint> generateWayPoint1() {
        WayPoint wayPoint0 = new WayPoint(22.751322,54.617592,1000,10);
        WayPoint wayPoint1 = new WayPoint(50.751222,45.617592,1000,10);
        WayPoint wayPoint2 = new WayPoint(55.451122,47.647592,1000,10);
        List<WayPoint> testWayPoint = new ArrayList<>();
        testWayPoint.add(wayPoint0);
        testWayPoint.add(wayPoint1);
        testWayPoint.add(wayPoint2);
        return testWayPoint;
    }

    public List<WayPoint> generateWayPoint2() {
        WayPoint wayPoint0 = new WayPoint(51.351322,39.417592,1000,10);
        WayPoint wayPoint1 = new WayPoint(52.651222,30.617592,1000,10);
        WayPoint wayPoint2 = new WayPoint(54.451122,40.647592,1000,10);
        List<WayPoint> testWayPoint = new ArrayList<>();
        testWayPoint.add(wayPoint0);
        testWayPoint.add(wayPoint1);
        testWayPoint.add(wayPoint2);
        return testWayPoint;
    }
}
