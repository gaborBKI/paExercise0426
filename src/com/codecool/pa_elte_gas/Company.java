package com.codecool.pa_elte_gas;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Car> cars = new ArrayList<>();
    private GasStation gasStation = new GasStation(20, 500);
    private boolean areAllCarsStopped;

    public void createCars(int numberOfCars){
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car(i));
        }
    }

    public void simulate() {
        while (!areAllCarsStopped) {
            for (Car car : cars) {
                car.setDistanceToDrive(RandomGenerator.generateNumber(10, 1000));
                car.prepareForJourney(gasStation);
            }
            areAllCarsStopped = cars.stream().noneMatch(car -> car.isStopped() == false);
            cars.forEach(car -> System.out.println(car.toString()));
        }
    }
}
