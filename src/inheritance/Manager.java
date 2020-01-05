package inheritance;

public final class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary(){

        double salaryFull = super.getSalary();
        return salaryFull + bonus;
    }
    public void setBonus(double b){
        bonus = b;
    }
}
