package com.code.wars.tasks;

public class MiddleString {
    public static void main(String[] args) {
        System.out.println(middleString("12345"));
        System.out.println(middleString("abc"));
        System.out.println(middleString("xy"));
    }

    private static String middleString(String s) {
        return s.substring(1, s.length() - 1);
    }
}
