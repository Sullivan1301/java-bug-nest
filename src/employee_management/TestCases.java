package employee_management;

public class TestCases {
    public static void main(String[] args) {
        // Creating employees
        FullTimeEmployee koto = new FullTimeEmployee(1, "Koto", 3_000_000);
        PartTimeEmployee lita = new PartTimeEmployee(2, "Lita", 22, 11_750);

        // Creating department
        Department department = new Department("HR");

        // TODO : prevent the direct access here
        koto.setMonthlySalary(6_000_000);
        lita.setHoursWorked(1_000);

        // Test negative monthlySalary for FullTimeEmployee
        FullTimeEmployee negativeSalaryEmployee = new FullTimeEmployee(3, "Negative Salary", -100_000);
        // Setting the salary using the setter to handle negative values
        negativeSalaryEmployee.setMonthlySalary(-200_000);

        // Test negative hourlyRate for PartTimeEmployee
        PartTimeEmployee negativeRateEmployee = new PartTimeEmployee(4, "Negative Rate", 20, -500);
        // Setting the hourly rate using the setter to handle negative values
        negativeRateEmployee.setHourlyRate(-1_000);

        // TODO : fix the string format of both full time and part time employees
        // NOTE : do not show sensitive data such as hourlyRate or monthlySalary here !
        System.out.println("Details about Koto " + koto);
        System.out.println("Details about Lita " + lita);
        System.out.println("Details about Negative Salary Employee " + negativeSalaryEmployee);
        System.out.println("Details about Negative Rate Employee " + negativeRateEmployee);
        System.out.println("Department Employees:");
        department.displayEmployeesDetails();
    }
}


