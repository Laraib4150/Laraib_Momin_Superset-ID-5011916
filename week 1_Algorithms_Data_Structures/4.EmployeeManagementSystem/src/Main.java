// Main.java
public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        // Adding Employees
        system.addEmployee(new Employee("E001", "John Doe", "Developer", 70000));
        system.addEmployee(new Employee("E002", "Jane Smith", "Manager", 90000));
        system.addEmployee(new Employee("E003", "Emily Johnson", "Analyst", 60000));

        // Searching for an Employee
        System.out.println("Search Result: " + system.searchEmployeeById("E002"));

        // Traversing All Employees
        System.out.println("All Employees:");
        system.traverseEmployees();

        // Deleting an Employee
        system.deleteEmployeeById("E003");
        System.out.println("Employees After Deletion:");
        system.traverseEmployees();
    }
}
