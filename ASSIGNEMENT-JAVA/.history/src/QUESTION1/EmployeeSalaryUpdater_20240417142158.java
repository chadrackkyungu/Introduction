package QUESTION1;

import java.io.IOException;
import java.util.List;

public class EmployeeSalaryUpdater {
    public static void main(String[] args) {

        // File path to employee
        String filePath = "employee.txt";

        try {

            System.out.println("****READING EMPLOYEE FORM***");

            // Read the employee file
            List<Employee> employees = FileManager.readEmployees(filePath);
            employees.forEach(Employee::increaseSalary);

            // Write to employee file
            FileManager.writeEmployees(filePath, employees);

            System.out.println("******UPDATE COMPLETE******");

        } catch (IOException e) {

            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
