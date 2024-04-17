package QUESTION1;

import java.io.IOException;
import java.util.List;

public class EmployeeSalaryUpdater {

    public static void main(String[] args) { // This is the Method that execute

        // File path to employee
        String filePath = "employee.txt";

        try {

            System.out.println("****READ & UPDATE EMPLOYEE FORM***");

            // Read the employee file
            List<Employee> employees = FileManager.readEmployees(filePath);
            employees.forEach(Employee::increaseSalary);

            // Write to employee file
            String resultMessage = FileManager.writeEmployees(filePath, employees);

            // Display the success message after successful write operation
            System.out.println(resultMessage);

            System.out.println("******END READING & UPDATING THE FORM******");

        } catch (IOException e) {

            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
