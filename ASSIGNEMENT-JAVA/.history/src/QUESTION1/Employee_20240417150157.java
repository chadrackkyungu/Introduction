package QUESTION1;

public class Employee {

    private static final double INCREASE_LESS_THAN_FIVE = 1.05;
    private static final double INCREASE_BETWEEN_FIVE_AND_TEN = 1.15;
    private static final double INCREASE_MORE_THAN_TEN = 1.30;

    private String name;
    private String surname;
    private int yearsWorked;
    private double salary;

    public Employee(String name, String surname, int yearsWorked, double salary) {
        this.name = name;
        this.surname = surname;
        this.yearsWorked = yearsWorked;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary() {
        if (yearsWorked < 5) {
            salary *= INCREASE_LESS_THAN_FIVE;
        } else if (yearsWorked <= 10) {
            salary *= INCREASE_BETWEEN_FIVE_AND_TEN;
        } else {
            salary *= INCREASE_MORE_THAN_TEN;
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + yearsWorked + " " + Math.round(salary);
    }
}
