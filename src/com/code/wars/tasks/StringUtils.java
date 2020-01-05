package com.code.wars.tasks;

public class StringUtils {
    public static void main(String[] args) {

        /*
         1st solution
        */

//        System.out.print(StringUtils.toAlternativeString("hELLO wORLD "));
//    }
//
//    public static String toAlternativeString(String string) {
//
//        char[] ch = string.toCharArray();
//        for (int i = 0; i < string.length(); i++) {
//            if (ch[i] >= 'a' && ch[i] <= 'z') {
//                ch[i] = (char) (ch[i] - 32);
//            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
//                ch[i] = (char) (ch[i] + 32);
//            }
//        }
//        for (int i = 0; i < string.length(); i++) {
//            System.out.print(ch[i]);
//        }
//        return string;


        /*
          2nd solution
        */

        System.out.println(StringUtils.toAlternativeString2("HELLO world"));
    }

    public static String toAlternativeString(String string) {

        char[] currentChar = string.toCharArray();
        for (int i = 0; i < currentChar.length; i++) {
            currentChar[i] = Character.isUpperCase(currentChar[i])
                    ? Character.toLowerCase(currentChar[i]) : Character.toUpperCase(currentChar[i]);
        }
        return new String(currentChar);
    }

    public static String toAlternativeString2(String string) {
        char[] currentChar = string.toCharArray();
        for (int i = 0; i < currentChar.length; i++) {
            currentChar[i] = toAlternateChar(currentChar[i]);
        }
        return new String(currentChar);
    }

    public static char toAlternateChar(char ch) {
        return Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
    }

    public static char toAlternateChar2(final char ch) {
        if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch);
        } else {
            return Character.toUpperCase(ch);
        }
    }
}



