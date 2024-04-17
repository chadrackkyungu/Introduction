package QUESTION1;

import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;
import java.io.IOException;

// This class has 2 methods one that read to the employee file and the other one that write to the employee file
public class FileManager {

    // * Method(function) that Read the employee file
    public static ResultWithMessage<List<Employee>> readEmployees(String fileName) throws IOException {
        Path path = Paths.get(fileName);

        // * throw an exception if the file does not exist
        if (!Files.exists(path)) {
            throw new FileNotFoundException("The Employee File could not be found: " + path.toAbsolutePath());
        }

        // * start reading the employee file
        List<Employee> employees = Files.lines(path)
                .skip(1) // Skips the header line
                .map(line -> line.split("\\s+"))
                .map(parts -> new Employee(parts[0], parts[1], Integer.parseInt(parts[2]),
                        Double.parseDouble(parts[3])))
                .collect(Collectors.toList());

        return new ResultWithMessage<>(employees,
                "File successfully read with " + employees.size() + " employee records.");
    }

    // * Method(function) that writes the employee
    public static String writeEmployees(String fileName, List<Employee> employees) throws IOException {
        Path path = Paths.get(fileName);

        List<String> lines = employees.stream()
                .map(Employee::toString)
                .collect(Collectors.toList());
        lines.add(0, "Name Surname Years Worked Salary"); // Add header at the beginning
        Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        return "File successfully updated with new employee details.";
    }
}
