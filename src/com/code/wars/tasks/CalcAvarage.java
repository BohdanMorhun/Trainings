package com.code.wars.tasks;

import java.util.stream.IntStream;

public class CalcAvarage {
    public static void main(String[] args) {

        System.out.println(find_average(new int[]{4, 5, 6, 7, 8, -9}));

    }
    public static double find_average(int[] array){

        double avarage = IntStream.of(array)
                .average()
                .getAsDouble();
        return avarage;
    }
}
