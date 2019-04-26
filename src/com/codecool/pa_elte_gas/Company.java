package com.codecool.pa_elte_gas;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Car> cars = new ArrayList<>();
    private GasStation gasStation = new GasStation();

    public void createCars(int numberOfCars){
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car(i));
        }
    }

    public void simulate() {

    }
}
