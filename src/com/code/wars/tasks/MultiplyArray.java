package com.code.wars.tasks;

import java.util.Arrays;

public class MultiplyArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(MultiplyArray.map(new int[]{1, 1, 1, 1, 1, 1,})));
    }

    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
}