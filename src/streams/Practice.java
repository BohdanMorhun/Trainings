package streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {

//        Stream.generate(() -> 6)
//                .limit(6)
//                .forEach(System.out::println);

//        Stream.concat(Stream.of(1,3,4),
//                      Stream.of(4,5,6))
//                              .forEach(System.out::print);

//        Stream.of(2,4,5,6,7,7)
//                .filter(x -> x > 5)
//                .map(x -> x * 2)
//                .sorted()
//                .forEach(System.out::println);

//        final double count = IntStream.range(4,16)
//                .average()
//                .getAsDouble();
//        System.out.println(count);

//        IntSummaryStatistics intSummaryStatistics = IntStream.of(4,56,778,8)
//                .summaryStatistics();
//        System.out.println(intSummaryStatistics.getMax()+ "\n" + intSummaryStatistics.getAverage());

//        Stream.of("Hi","HELLO", "World")
//               .filter(x -> x.startsWith("H"))
//               .map(String::toLowerCase)
//              .forEach(System.out::println);

        int sum = Stream.of(2, 4, 5, 6, 7, 7)
                .reduce(0, (x, y) -> {
                    System.out.println(String.format("(%d, %d) -> %d", x, y, x + y));
                    return x + y;
                });
        System.out.println(sum);

        int summ = IntStream.range(2, 10)
                .sum();
        System.out.println(summ);

        int min = IntStream.range(2, 10).min().getAsInt();
        System.out.println(min);

        String s = Stream.of("Hi", "HELLO", "World")
                .collect(Collectors.joining("-"));
        System.out.println(s);

//        final List<Cat> cats = Arrays.asList(
//                new Cat("x", 1, "q"),
//                new Cat("x", 1, "q"),
//                new Cat("x", 1, "q"),
//                new Cat("x", 1, "q")
//        );
//        final Stream<String> colorsStream = cats.stream()
//                .filter(c -> c.getAge() < 5)
//                .map(Cat::getColor);
//
//        System.out.println(colorsStream.collect(Collectors.joining(",")));
//        System.out.println(colorsStream.count());
    }
}
