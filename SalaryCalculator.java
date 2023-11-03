import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Employee Number: ");
        int empNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Constants
        double DA_PERCENT = 0.70;
        double HRA_PERCENT = 0.30;
        double CCA = 240;
        double PF_PERCENT = 0.10;
        double PT = 100;

        // Calculate Salary Components
        double da = DA_PERCENT * basicSalary;
        double hra = HRA_PERCENT * basicSalary;
        double pf = PF_PERCENT * basicSalary;
        double grossSalary = basicSalary + da + hra + CCA;
        double netSalary = grossSalary - pf - PT;

        // Display the Salary Details
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("CCA: " + CCA);
        System.out.println("PF: " + pf);
        System.out.println("PT: " + PT);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);

        scanner.close();
    }
}