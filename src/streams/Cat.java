package streams;

public class Cat {

    private String name;
    private int age;
    private String color;

    public String getName() {
        // [static] String getName(Cat this)
        return name;
    }

    public String nonstaticGetName(Cat cat) {
        // [static] String nonstaticGetName(Cat this, Cat cat)
        return name;
    }

    public static String staticGetName(Cat cat) {
        // [static] String staticGetName(Cat cat)
        return cat.name;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
