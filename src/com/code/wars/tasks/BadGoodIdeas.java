package com.code.wars.tasks;

public class BadGoodIdeas {
    public static void main(String[] args) {
        System.out.println(well(new String[]{"bad", "Good", "good", "bad", "good"}));
//        System.out.println(well(new String[]{"bad", "bad", "bad", "bad", "bad"}));
    }

    public static String well(String[] x) {
        int count = 0;
        for (String s : x) {
            if (s.equalsIgnoreCase("good")) {
                count++;
            }
        }
        if (count > 2) {
            return "I smell a series!";
        }
         if (count >= 1) {
            return "Publish!";
        }
        return "Fail!";
    }
}
