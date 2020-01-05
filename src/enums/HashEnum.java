package enums;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashEnum {
    public static void main(String[] args) {
        final List<Color> colors = Arrays.asList(
                Color.RED,
                Color.BLACK,
                Color.BLACK,
                Color.BLUE,
                Color.RED,
                Color.BLUE,
                Color.BLUE,
                Color.BLUE
        );

        System.out.println(colors.size());
        System.out.println(new HashSet<>(colors).size());

        Color color1 = Color.BLUE;
        Color color2 = Color.BLUE;
        Color color3 = Color.BLACK;
        System.out.println(color1.equals(color2));
        System.out.println(color1.equals(color3));
    }
}

enum Color {
    RED, GREEN, BLUE, WHITE, BLACK
}