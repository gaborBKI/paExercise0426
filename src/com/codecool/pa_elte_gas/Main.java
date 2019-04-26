package com.codecool.pa_elte_gas;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        //company.createCars(5);
        company.simulate();
        System.out.println(RandomGenerator.generateNumber(2, 6));
    }
}
