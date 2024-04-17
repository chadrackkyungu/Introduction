package QUESTION1;

import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileManager {
    public static List<Employee> readEmployees(String fileName) throws IOException {
        Path path = Paths.get(fileName);

        // throw an exception if the file does not exist
        if (!Files.exists(path)) {
            throw new FileNotFoundException("The Employee File could not be found: " + path.toAbsolutePath());
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
