package generic;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class GenClass {
    public static void main(String[] args) {

        List<Person> listPerson = Arrays.asList(
                new Person("Bob", 34),
                new Person("Jack", 45),
                new Person("Nick", 20));

        listPerson.stream()
                .filter(x -> x.getName().startsWith("B"))
                .forEach(System.out::println);
    }

    public static void mStr(List<String> stringList) {
        System.out.println(stringList);
    }

    public static void mPers(List<Person> personList) {
        System.out.println(personList);
    }
}

final class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
