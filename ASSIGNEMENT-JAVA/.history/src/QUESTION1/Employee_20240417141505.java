package QUESTION1;

public class Employee {

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
            salary *= 1.05; // 5% increase
        } else if (yearsWorked <= 10) {
            salary *= 1.15; // 15% increase
        } else {
            salary *= 1.30; // 30% increase
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + yearsWorked + " " + Math.round(salary);
    }
}
