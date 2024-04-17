public class EmployeeSalaryUpdater {
    public static void main(String[] args) {
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
