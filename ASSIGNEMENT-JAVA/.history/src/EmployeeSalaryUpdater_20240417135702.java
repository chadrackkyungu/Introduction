import java.io.File;
import java.io.IOException;
import java.util.List;

public class EmployeeSalaryUpdater {
    public static void main(String[] args) {
        String currentDirectory = new File("").getAbsolutePath();
        System.out.println("Current working directory: " + currentDirectory);

        try {
            List<Employee> employees = FileManager.readEmployees("employee.txt");
            employees.forEach(Employee::increaseSalary);
            FileManager.writeEmployees("employee.txt", employees);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
