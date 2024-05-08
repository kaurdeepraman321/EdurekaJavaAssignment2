/*Author:Ramandeep
Date:18-Feb-2024
 */
//Write a program to accept 5 employee IDs and the corresponding names and their salaries
//from the user and store them in three arrays.

package JavaAssignmentModule2;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);

                // Arrays to store employee details
                int[] employeeIDs = new int[5];
                String[] employeeNames = new String[5];
                double[] employeeSalaries = new double[5];

                // Accepting employee details from the user
                for (int i = 0; i < 5; i++) {
                    System.out.println("Enter details for employee " + (i + 1) + ":");
                    System.out.print("ID: ");
                    employeeIDs[i] = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Name: ");
                    employeeNames[i] = scanner.nextLine();
                    System.out.print("Salary: ");
                    employeeSalaries[i] = scanner.nextDouble();
                }

                // Displaying employee details
                display(employeeIDs, employeeNames, employeeSalaries);

                scanner.close();
            }

            // Function to display employee details
            public static void display(int[] ids, String[] names, double[] salaries) {
                System.out.println("\nEmployee Details:");
                System.out.println("ID\tName\tSalary");
                for (int i = 0; i < 5; i++) {
                    System.out.println(ids[i] + "\t" + names[i] + "\t" + salaries[i]);
                }
            }
        }



