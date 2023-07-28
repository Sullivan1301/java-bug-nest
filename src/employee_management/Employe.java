package employee_management;

/**
 * Abstract class Employee: represents a generic employee with an ID and a name.
 * This class is designed to be extended by FullTimeEmployee and PartTimeEmployee classes.
 */
public abstract class Employe {
    private int id;
    private String name;

    public Employe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * Abstract method to calculate the employee's pay.
     * This method must be implemented in the specific child classes (FullTimeEmployee and PartTimeEmployee).
     */
    public abstract double calculatePay();

    /**
     * Method to display details of the employee (ID and name).
     * This method is called by the displayEmployeesDetails method in the Department class.
     */
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }
}
