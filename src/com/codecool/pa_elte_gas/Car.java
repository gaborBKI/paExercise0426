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
        if(!isStopped) {
            if (canDrive(gasStation)) {
                drive();
            } else {
                isStopped = true;
            }
        }
    }

    private boolean canDrive(GasStation gasStation) {
        if (distanceToDrive * consumption <= fuel) {
            return  true;
        } else {
            return  tryToTakeFuel(gasStation);
        }

    }

    private boolean tryToTakeFuel(GasStation gasStation) {
        int fuelToTake = distanceToDrive * consumption - fuel;
        if (fuelToTake > maxFuel) {
            return false;
        }
        int moneyToPay = fuelToTake * gasStation.getPricePerLiter();
        if (moneyToPay <= balance && gasStation.getGasAmount() >= fuelToTake) {
            balance -= moneyToPay;
            fuel += fuelToTake;
            gasStation.serveGas(fuelToTake);
            return true;
        }
        return false;

    }

    private void drive() {
        fuel -= distanceToDrive * consumption;
    }

}
