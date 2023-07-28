package employee_management;

/**
 * Class FullTimeEmployee: represents a full-time employee.
 * A full-time employee has a fixed monthly salary.
 */
public class FullTimeEmployee extends Employe {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        } else {
            System.out.println("Monthly salary cannot be negative.");
        }
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}
