package com.code.wars.tasks;

import java.util.Random;

public class Ghost {

    private static final String[] COLORS = {"white", "yellow", "purple", "red"};

    Ghost() {
    }

    public String getColor() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }

    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        System.out.println(ghost.getColor());
        System.out.println(ghost.getColor());
        System.out.println(ghost.getColor());

        Ghost ghost2 = new Ghost();
        System.out.println(ghost2.getColor());
    }
}
