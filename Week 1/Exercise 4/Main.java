import java.util.ArrayList;

class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}

class EmployeeManagementSystem {
    private ArrayList<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Search for an employee by ID
    public Employee searchEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    // Traverse and print all employees
    public void traverseEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Delete an employee by ID
    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeId() == employeeId) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Adding employees
        ems.addEmployee(new Employee(1, "Alice", "Developer", 75000));
        ems.addEmployee(new Employee(2, "Bob", "Designer", 65000));

        // Traversing employees
        System.out.println("All employees:");
        ems.traverseEmployees();

        // Searching for an employee
        System.out.println("\nSearching for employee with ID 1:");
        Employee employee = ems.searchEmployee(1);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Deleting an employee
        System.out.println("\nDeleting employee with ID 2:");
        if (ems.deleteEmployee(2)) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        // Traversing employees again
        System.out.println("\nAll employees after deletion:");
        ems.traverseEmployees();
    }
}
