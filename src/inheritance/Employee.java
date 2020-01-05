package inheritance;

import java.time.LocalDate;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDate;

    Employee(String name, double salary, int year, int month, int day){
       this.name = name;
        this.salary = salary;
        hireDate = LocalDate.of(year, month, day);
    }

    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public LocalDate getHireDate(){
        return hireDate;
    }
}

