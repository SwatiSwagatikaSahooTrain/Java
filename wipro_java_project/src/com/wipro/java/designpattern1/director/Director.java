package com.wipro.java.designpattern1.director;

import com.wipro.java.designpattern1.builders.Builders;
import com.wipro.java.designpattern1.cars.CarType;
import com.wipro.java.designpattern1.components.Engine;
import com.wipro.java.designpattern1.components.GPSNavigator;
import com.wipro.java.designpattern1.components.Transmission;
import com.wipro.java.designpattern1.components.TripComputer;

public class Director {

    public void constructSportsCar(Builders builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builders builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builders builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
