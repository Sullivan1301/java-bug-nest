package employee_management;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Department: represents a department, which is a collection of employees.
 * Each department has a name and a list of employees associated with it.
 */
public class Department {
    private String name;
    private List<Employe> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    /**
     * Method to add an employee to the department.
     * First, it checks if the employee already exists in the department based on their ID and name.
     * If the employee does not exist, it adds them to the list of employees in the department.
     * Otherwise, it displays an error message.
     */
    public void addEmployee(Employe employee) {
        if (!containsEmployee(employee)) {
            employees.add(employee);
        } else {
            System.out.println("The employee with ID " + employee.getId() + " and name " + employee.getName() + " already exists in the department.");
        }
    }

    /**
     * Private method to check if an employee already exists in the department based on their ID and name.
     * Returns true if the employee exists, otherwise returns false.
     */
    private boolean containsEmployee(Employe employee) {
        for (Employe emp : employees) {
            if (emp.getId() == employee.getId() && emp.getName().equals(employee.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to display details of all employees in the department, including their pay.
     */
    public void displayEmployeesDetails() {
        for (Employe employee : employees) {
            employee.displayDetails();
            System.out.println("===============================");
        }
    }
}
