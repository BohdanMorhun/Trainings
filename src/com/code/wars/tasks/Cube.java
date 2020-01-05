package com.code.wars.tasks;



public class Cube {

    private int side;

    Cube() {
        side = 0;
    }

    Cube(int side) {
        this.side = side;
    }

    public int getSide() {
        if (side < 0) {
            side *= -1;
        }
        return side;
    }

    public void setSide(int num) {
        this.side = num;
    }

    public static void main(String[] args) {
        Cube cube = new Cube(-7);
        System.out.println(cube.getSide());
    }
}
