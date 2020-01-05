package abstact.classes;

public class Test {
    public static void main(String[] args) {

        Person[] people = new Person[2];

        people[0] = new Student("Bob", "IT");
        people[1] = new Student("Nick", "Building");

        for (Person p : people) {
            System.out.println(p.getDescription() + p.getName());
            System.out.println("" + p);

        }
    }
}


