package com.code.wars.tasks;

public class God {

    public static Human[] create() {
        return new Human[]{new Man(), new Woman()};
    }

    public static void main(String[] args) {

        Human human = new Man("Adam", 45);
//        human.name = "Adam";
        Human human1 = new Woman("Eva", 40);
//        human1.name = "Eva";
        System.out.println(human.getAge() + "\n" + human.getName() + "\n" + human1.getName());
        System.out.println(human.toString() + "\n" + human1.toString());
    }
}

class Human {
    private String name;
    private int age;

    Human() {
    }

    Human(String name) {
        this.name = name;
    }

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age='" + age + '\'' +
                ", name=" + name +
                '}';
    }
}

class Man extends Human {

    Man() {
    }

    Man(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return super.getName() + "!";
    }
}

class Woman extends Human {
    Woman() {
    }

    Woman(String name, int age) {
        super(name, age);
    }
}
