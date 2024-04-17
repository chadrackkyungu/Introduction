package QUESTION1;

import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileManager {
    public static List<Employee> readEmployees(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        if (!Files.exists(path)) {
            throw new FileNotFoundException("File not found: " + path.toAbsolutePath());
        }
        return Files.lines(path)
                .skip(1) // skips the header line
                .map(line -> line.split("\\s+"))
                .map(parts -> new Employee(parts[0], parts[1], Integer.parseInt(parts[2]),
                        Double.parseDouble(parts[3])))
                .collect(Collectors.toList());
    }

    public static void writeEmployees(String fileName, List<Employee> employees) throws IOException {
        Path path = Paths.get(fileName);
        List<String> lines = employees.stream()
                .map(Employee::toString)
                .collect(Collectors.toList());
        lines.add(0, "Name Surname Years Worked Salary"); // Add header at the beginning
        Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}

/*
 * import java.io.*;
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 * public class FileManager {
 * public static List<Employee> readEmployees(String fileName) throws
 * IOException {
 * List<Employee> employees = new ArrayList<>();
 * try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
 * reader.readLine(); // skip header line
 * String line;
 * while ((line = reader.readLine()) != null) {
 * String[] parts = line.split(" ");
 * String name = parts[0];
 * String surname = parts[1];
 * int yearsWorked = Integer.parseInt(parts[2]);
 * double salary = Double.parseDouble(parts[3]);
 * employees.add(new Employee(name, surname, yearsWorked, salary));
 * }
 * }
 * return employees;
 * }
 * 
 * public static void writeEmployees(String fileName, List<Employee> employees)
 * throws IOException {
 * try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
 * writer.println("Name Surname Years Worked Salary"); // write header
 * for (Employee employee : employees) {
 * writer.println(employee.toString());
 * }
 * }
 * }
 * }
 */
