package com.codecool.pa_elte_gas;

public class GasStation {
    private int gasAmount;
    private int pricePerLiter;
    private int money;

    GasStation(int pricePerLiter, int gasAmount){
        this.pricePerLiter = pricePerLiter;
        this.gasAmount = gasAmount;
        this.money = 0;
    }

    public void serveGas(int liter) {
        gasAmount -= liter;
        money += liter * pricePerLiter;

    }

    public int getGasAmount() {
        return gasAmount;
    }

    public int getPricePerLiter() {
        return pricePerLiter;
    }
}
