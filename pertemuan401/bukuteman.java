/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// bukuteman.java

package pertemuan401;

import java.util.Scanner;

/**
 *
 * @author 2201010153_Andre
 * TGL : 2024-04-23
 */
public class bukuteman {
    private int rows = 10;
    private int columns = 3;
    private String[][] data = new String[rows][columns];
    private int activeEntries = 0;

    private Scanner scanner; // Instance variable for Scanner

    public bukuteman(Scanner scanner) { // Constructor to receive Scanner
        this.scanner = scanner;
    }

    public void addData() {
        if (activeEntries >= rows) {
            System.out.println("Data is full!");
            return;
        }

        System.out.println("Adding Friend Data");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("Name: ");
        data[activeEntries][0] = scanner.nextLine();

        System.out.print("Address: ");
        data[activeEntries][1] = scanner.nextLine();

        System.out.print("Phone Number: ");
        data[activeEntries][2] = scanner.nextLine();

        activeEntries++;
    }

    public void updateData(int index) {
        if (index < 0 || index >= activeEntries) {
            System.out.println("Invalid index! Please enter a valid record number.");
            return;
        }

        System.out.println("Updating Friend Data (Record Number " + index + ")");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("Update Name (Enter - to skip): ");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) {
            data[index][0] = newName;
        }

        System.out.print("Update Address (Enter - to skip): ");
        String newAddress = scanner.nextLine();
        if (!newAddress.isEmpty()) {
            data[index][1] = newAddress;
        }

        System.out.print("Update Phone Number (Enter - to skip): ");
        String newPhone = scanner.nextLine();
        if (!newPhone.isEmpty()) {
            data[index][2] = newPhone;
        }

        System.out.println("Record updated successfully!");
    }

    public void deleteData(int index) {
        if (index < 0 || index >= activeEntries) {
            System.out.println("Invalid index! Please enter a valid record number.");
            return;
        }

        // Shift elements to the left to overwrite the deleted data
        for (int i = index; i < activeEntries - 1; i++) {
            data[i] = data[i + 1];
        }

        activeEntries--;
        System.out.println("Record deleted successfully!");
    }

    public void viewData() {
        if (activeEntries == 0) {
            System.out.println("No friend data found!");
            return;
        }

        System.out.println("Friend List");
        System.out.println("~~~~~~~~~~~~");

        for (int i = 0; i < activeEntries; i++) {
            System.out.println("Record Number: " + i);
            System.out.println("Name: " + data[i][0]);
            System.out.println("Address: " + data[i][1]);
            System.out.println("Phone Number: " + data[i][2]);
            System.out.println();
        }
    }
}

