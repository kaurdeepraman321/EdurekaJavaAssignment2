//Write another function display() with Employee ID array and Employee name array as
//arguments.
package JavaAssignmentModule2;

import java.util.Scanner;

public class MployeeDataWithMethodOverloading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] EmployeeID = new int[5];
        String[] EmloyeeName = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Emloyee details " + (i + 1) + ":");
            System.out.println("ID ");
            EmployeeID[i] = scan.nextInt();
            scan.nextLine();
            System.out.println("Name");
            EmloyeeName[i] = scan.nextLine();


        }
        display(EmployeeID, EmloyeeName);
        scan.close();
    }

    public static void display(int[] ids) {
        System.out.println("\nEmployee Details: ");
        System.out.println("ID");

        for (int i = 0; i < 5; i++) {
            System.out.println(ids[i]);
        }
    }
        public static void display (int[] ids, String[] name){
            System.out.println("\nEmployee Details: ");
            System.out.println("ID\tName");

            for (int i = 0; i < 5; i++) {
                System.out.println(ids[i] + "\t" + name[i]);
            }
        }
    }

