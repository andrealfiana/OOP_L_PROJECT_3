/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan401;

import java.util.Scanner;

/**
 *
 * @author 2201010153_Andre
 * TGL : 2024-04-23
 */
public class Pertemuan401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        bukuteman BTeman = new bukuteman(scanner); // Pass the scanner to bukuteman constructor

        String ul = "YA";
        do {
            System.out.println("A. View Data");
            System.out.println("B. Add Data");
            System.out.println("C. Edit Data");
            System.out.println("D. Delete Data");
            System.out.println("E. Exit");
            System.out.print("Choose Option (A/B/C/D/E): ");
            String mPIL = scanner.nextLine();

            switch (mPIL) {
                case "A":
                    BTeman.viewData();
                    break;
                case "B":
                    BTeman.addData();
                    break;
                case "C":
                    System.out.print("Enter record number to edit: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character after int input
                    BTeman.updateData(editIndex);
                    break;
                case "D":
                    System.out.print("Enter record number to delete: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character after int input
                    BTeman.deleteData(deleteIndex);
                    break;
                case "E":
                    ul = "tidak";
                    break;
                default:
                    System.out.println("Invalid choice. Please enter A/B/C/D/E.");
            }
        } while (ul.equals("YA"));

        scanner.close(); // Close the Scanner when done
    }
}
