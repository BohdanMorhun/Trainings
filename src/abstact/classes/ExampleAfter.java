package abstact.classes;

import java.util.Arrays;
import java.util.Random;

public class ExampleAfter {
    private static final int MAX_SIZE = 20;

    private final int[] values;
    private final Random random = new Random();

    public static void main(String[] args) {
        new ExampleAfter().print();
    }

    public ExampleAfter() {
        values = new int[random.nextInt(MAX_SIZE) + 1];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt();
        }
    }

    public void print() {
        preProcess();
        postProcess();
        show();
    }

    private void show() {
        System.out.println(Arrays.toString(values));
    }

    private void postProcess() {
        Arrays.sort(values);
    }

    private void preProcess() {
        for (int i = 0; i < values.length; i++) {
            values[i] /= 2;
        }
    }
}
