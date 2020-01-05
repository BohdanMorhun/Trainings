package inheritance;

public class Test {
    public static void main(String[] args) {

        Manager  m = new Manager("BOB",20000,1989,04,30);
        m.setBonus(1000);

        Employee [] stuff = new Employee[3];

                stuff[0] = m;
                stuff[1]= new Employee("Nick",10000,1987,12,2);
                stuff[2]= new Employee("Nick",12000,1987,1,23);

        for (Employee e : stuff) {
            System.out.println("name: " + e.getName() + "\n"+ " salary: " + e.getSalary() +
                    "\n" + " hireDay: " + e.getHireDate());

        }
    }
}
