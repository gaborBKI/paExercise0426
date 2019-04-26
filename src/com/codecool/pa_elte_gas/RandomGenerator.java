package com.codecool.pa_elte_gas;

import java.util.Random;

public class RandomGenerator {
    private static final Random RANDOM = new Random();

//    public static String generateString() {
//        String[] possibleNames = {};
//        return "";
//    }

    public static int generateNumber(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }
}
