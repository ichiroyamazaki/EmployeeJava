package Employee;

public class PartTimeEmployee extends Employee {
    private double ratePerHour;
    private int hoursWorked;
    private double wage;

    // Setter method for ratePerHour and hoursWorked
    public void setWage(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        this.wage = ratePerHour * hoursWorked; // Calculate the wage
    }

    // Getter method for wage
    public double getWage() {
        return wage;
    }
}
