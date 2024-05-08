package JavaAssignmentModule2;

import java.util.Scanner;

public class EmployeeDataWithSearchFunction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] regno = new int[5];
        String[] Empname = new String[5];
        double[] salary = new double[5];

        // Accepting data for the arrays
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.println("ID:");
            regno[i] = scan.nextInt();
            scan.nextLine(); // Consume newline
            System.out.println("Name:");
            Empname[i] = scan.nextLine();
            System.out.println("Salary:");
            salary[i] = scan.nextDouble();
            scan.nextLine(); // Consume newline
        }

        // Calling the 2 display() functions
        display(regno, Empname, salary);
        display("Divya", regno, Empname, salary); // Example search for name "Divya"

        scan.close();
    }

    // Display function for all records
    public static void display(int[] regno, String[] Empname, double[] salary) {
        System.out.println("\nEmployee Details:");
        System.out.println("ID\tName\tSalary");
        for (int i = 0; i < 5; i++) {
            System.out.println(regno[i] + "\t" + Empname[i] + "\t" + salary[i]);
        }
    }

    // Display function for specific record by name search
    public static void display(String name, int[] regno, String[] Empname, double[] salary) {
        System.out.println("\nSearch Results for Employee Name: " + name);
        System.out.println("ID\tSalary");
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (Empname[i].equalsIgnoreCase(name)) {
                System.out.println(regno[i] + "\t" + salary[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with name " + name + " not found.");
        }
    }
}
