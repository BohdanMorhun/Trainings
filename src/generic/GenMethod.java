package generic;

import java.util.ArrayList;

public class GenMethod {
    public static void main(String[] args) {

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(4.5);
        doubles.add(6.5);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(6);

        System.out.println("sum = " + addNumbers(doubles));
        System.out.println("sum = " + addNumbers(integers));

        System.out.println("sum = " + addNumbers1(integers, doubles));

        System.out.println("sum = " + addNumbers2(integers, integers));
        System.out.println("sum = " + addNumbers2(doubles,doubles));

        System.out.println("sum = " + addNumbers3(integers, doubles));
        System.out.println("sum = " + addNumbers3(integers, integers));
        System.out.println("sum = " + addNumbers3(doubles, doubles));
    }

    public static Double addNumbers(ArrayList<? extends Number> numbers) {
        double sum = 0.0;
        for (Number n : numbers) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static Double addNumbers1(ArrayList<? extends Number> numbers1, ArrayList<? extends Number> numbers2) {
        double sum = 0.0;
        for (Number n : numbers1) {
            sum += n.doubleValue();
        }
        for (Number n : numbers2) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static <T extends Number> Double addNumbers2(ArrayList<T> numbers1, ArrayList<T> numbers2) {
        double sum = 0.0;
        for (T n : numbers1) {
            sum += n.doubleValue();
        }
        for (T n : numbers2) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static <T extends Number, R extends Number> Double addNumbers3(ArrayList<T> numbers1, ArrayList<R> numbers2) {
        double sum = 0.0;
        for (T n : numbers1) {
            sum += n.doubleValue();
        }
        for (R n : numbers2) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
