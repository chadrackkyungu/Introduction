import java.io.IOException;
import java.util.List;

public class EmployeeSalaryUpdater {
    public static void main(String[] args) {
        String filePath = "B:\\RICHFIELD\\FINAL YEAR\\ASSIGNEMENTS\\SEMESTER 1\\ASSIGNEMENT-JAVA\\src\\employee.txt";
        try {
            System.out.println("Reading employees from: " + filePath);
            List<Employee> employees = FileManager.readEmployees(filePath);
            employees.forEach(Employee::increaseSalary);

            System.out.println("Writing updated employees back to file.");
            FileManager.writeEmployees(filePath, employees);
            System.out.println("Update complete.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
