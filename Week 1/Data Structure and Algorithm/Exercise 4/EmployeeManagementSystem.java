package Exercise_4;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    
    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    
    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size] = employee;
            size++;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; 
    }

    
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    
    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null; 
                size--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee emp1 = new Employee(1, "Alice", "Manager", 70000);
        Employee emp2 = new Employee(2, "Bob", "Developer", 50000);
        Employee emp3 = new Employee(3, "Charlie", "Designer", 60000);

        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("Search Employee with ID 2:");
        System.out.println(ems.searchEmployee(2));

        System.out.println("Deleting Employee with ID 1");
        ems.deleteEmployee(1);

        System.out.println("All Employees after deletion:");
        ems.traverseEmployees();
    }
}
