package com.code.wars.tasks;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        System.out.println(noSpace("Hello World !"));
        System.out.println(noSpace2("Hello World !"));
        System.out.println(noSpace("Hello World !"));

    }

    static String noSpace(final String x) {
        char[] ch = x.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != ' '){
                s.append(ch[i]);
            }
        }
        return s.toString();
    }

    static String noSpace2(final String x) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            final char ch = x.charAt(i);
            if(ch != ' '){
                s.append(ch);
            }
        }
        return s.toString();
    }

    static String noSpace3(final String x) {
        return x.replace(" ","");
    }
}

