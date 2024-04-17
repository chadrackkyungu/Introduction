import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static List<Employee> readEmployees(String fileName) throws IOException {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.readLine(); // skip header line
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                String surname = parts[1];
                int yearsWorked = Integer.parseInt(parts[2]);
                double salary = Double.parseDouble(parts[3]);
                employees.add(new Employee(name, surname, yearsWorked, salary));
            }
        }
        return employees;
    }

    public static void writeEmployees(String fileName, List<Employee> employees) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Name Surname Years Worked Salary"); // write header
            for (Employee employee : employees) {
                writer.println(employee.toString());
            }
        }
    }
}
