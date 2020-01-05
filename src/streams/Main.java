package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Cat> catList = Arrays.asList(
                new Cat("Vaska", 4, "grey"),
                new Cat("Jany", 5, "white"),
                new Cat("Murka", 3, "red"),
                new Cat("Bonifaciy", 1, "black"),
                new Cat("Umka", 2, "black&white")
        );
        printList(catList);

        List<String> listByAge = catList.stream()
                .filter(x -> x.getAge() > 3)
//                .map(Cat::staticGetName)
                .map(Cat::getName)
//                .map(x -> x.getName())
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toCollection(ArrayList::new));
        printList(listByAge);
    }

    public static void printList(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
