package comparator;

import java.util.*;

public class CarTest {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", 2009));
        carList.add(new Car("Toyota", 2015));
        carList.add(new Car("Suzuki", 2018));
        carList.add(new Car("Lexus", 2008));
        carList.add(new Car("Reno", 2019));

        Comparator<Car> comparatorByBrand = Comparator.comparing(Car::getBrand);
        carList.sort(comparatorByBrand);
        System.out.println(carList);

        carList.sort(new ComparatorByBrand());
        System.out.println(carList);

        Comparator<Car> comparatorByYear = Comparator.comparing(Car::getYear);
        carList.sort(comparatorByYear);
        System.out.println(carList);


    }
}
