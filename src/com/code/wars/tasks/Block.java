package com.code.wars.tasks;

public class Block {

    private int width;
    private int length;
    private int height;

    public Block(int[] param) {
        width = param[0];
        length = param[1];
        height = param[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * (width * height + length * height + width * length);
    }

    public static void main(String[] args) {

        Block b = new Block(new int[]{2, 4, 6});
        System.out.println("The surface area: " + b.getSurfaceArea());
        System.out.println("The volume: " + b.getVolume());
        System.out.println("The height: " + b.height);
    }
}

