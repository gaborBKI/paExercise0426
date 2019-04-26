package com.codecool.pa_elte_gas;

public class Car {
    private String name;
    private int balance;
    private int consumption;
    private int maxFuel;
    private int fuel;
    private int distanceToDrive;
    private boolean isStopped;

    public Car(int index) {
        this.name = "Car" + index;
        this.balance = RandomGenerator.generateNumber(1000, 5000);
        this.consumption = RandomGenerator.generateNumber(5, 15);
        this.maxFuel = RandomGenerator.generateNumber(20, 60);
        this.fuel = maxFuel / RandomGenerator.generateNumber(1, 11);
    }

    public void prepareForJourney(GasStation gasStation) {

    }

    private boolean canDrive(GasStation gasStation) {
        return false;
    }

    private void takeFuel(GasStation gasStation) {

    }

    private void drive() {

    }

}
