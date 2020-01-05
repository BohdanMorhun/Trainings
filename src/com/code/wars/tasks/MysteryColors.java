package com.code.wars.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


interface MysteryColorAnalyzer {
    int numberOfDistinctColors(List<Color> mysteryColors);

    int colorOccurrence(List<Color> mysteryColors, Color color);
}

enum Color {
    RED, GREEN, BLUE, BLACK
}

class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {

    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {

        return new HashSet<>(mysteryColors).size();
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {

        return (int) mysteryColors.stream().filter(c -> c == color).count();
    }

    public static void main(String[] args) {

        final List<Color> colors = Arrays.asList(
                Color.RED,
                Color.GREEN,
                Color.GREEN,
                Color.BLUE,
                Color.RED,
                Color.BLUE,
                Color.BLUE,
                Color.BLACK
        );
        MysteryColorAnalyzerImpl mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();
        System.out.println(mysteryColorAnalyzer.colorOccurrence(colors, Color.GREEN));
        System.out.println(mysteryColorAnalyzer.numberOfDistinctColors(colors));
    }
}