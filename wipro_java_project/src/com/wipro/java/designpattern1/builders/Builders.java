package com.wipro.java.designpattern1.builders;

import com.wipro.java.designpattern1.cars.CarType;
import com.wipro.java.designpattern1.components.Engine;
import com.wipro.java.designpattern1.components.GPSNavigator;
import com.wipro.java.designpattern1.components.Transmission;
import com.wipro.java.designpattern1.components.TripComputer;

public interface Builders {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}