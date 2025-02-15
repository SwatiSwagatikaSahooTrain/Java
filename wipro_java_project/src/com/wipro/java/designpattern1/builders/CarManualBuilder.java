package com.wipro.java.designpattern1.builders;

import com.wipro.java.designpattern1.cars.CarType;
import com.wipro.java.designpattern1.cars.Manual;
import com.wipro.java.designpattern1.components.Engine;
import com.wipro.java.designpattern1.components.GPSNavigator;
import com.wipro.java.designpattern1.components.Transmission;
import com.wipro.java.designpattern1.components.TripComputer;

public class CarManualBuilder implements Builders{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
