package com.code.wars.tasks;

public class SmallestIntegerFinder {
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{30, -6, 78, 9, 0}));
        System.out.println(findSmallestInt(new int[]{}));
        System.out.println(findSmallestInt(null));
//        true = 1;
//        false = 0;
//
//        true && true  --- 1 * 1 = 1;
//        true && false --- 1 * 0 = 0;
//        false && true --- 0 * 1 = 0;
//        false && false --- 0 * 0 = 0;
//
//         true || true  --- 1 + 1 = 1;
//         true || false --- 1 + 0 = 1;
//        false || true  --- 0 + 1 = 1;
//        false || false --- 0 + 0 = 0;
//
//
//        true && !true = false;


        // if (0 != 0 && link != null)
        // if (false && true)
        // if (false)

        // if (null != null && ....)
        // if (false && ....)

//        int a = 10000;
//        int b = 3;
//        int[] c = {10, 20, 30};
//        int d = 1;
//        a = c[d];
//        System.out.println(a); -> 20
    }


    public static int findSmallestInt(int[] args) {
        if (args == null || args.length == 0) {
            return 0;
        }

        int minValue = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < minValue) {
                minValue = args[i];
            }
        }
        return minValue;
    }
}
