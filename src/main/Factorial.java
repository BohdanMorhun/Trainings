package main;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(fact(4));

    }
    public static int fact(final int n){

        int count = 1;
        for (int i = 1; i <= n; i++) {
            count *=i;
        }
        return count;
    }
}
