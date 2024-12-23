import java.util.Scanner;

public class RunEmployee {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = a.nextLine();

        System.out.print("Enter employee type (F for Full-Time, P for Part-Time): ");
        String empType = a.next().toUpperCase();

        if (empType.equals("F")) {
            System.out.print("Enter monthly salary: ");
            double salary = a.nextDouble();

            FullTimeEmployee fte = new FullTimeEmployee();
            fte.setName(name);
            fte.setMonthlySalary(salary);

            System.out.println("Name: " + fte.getName());
            System.out.println("Wage: " + String.format("%.2f", salary));
        } else if (empType.equals("P")) {
            System.out.print("Enter rate per hour and no. of hours worked separated by space: ");
            double ratePerHour = a.nextDouble();
            int hoursWorked = a.nextInt();

            PartTimeEmployee pte = new PartTimeEmployee();
            pte.setName(name);
            pte.setWage(ratePerHour, hoursWorked);

            System.out.println("Employee Name: " + pte.getName());
            System.out.println("Wage: " + String.format("%.2f", pte.getWage()));
        } else {
            System.out.println("Invalid employee type. Please enter 'F' for Full-Time or 'P' for Part-Time.");
        }

        a.close();
    }
}
