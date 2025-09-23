/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.warehousereportingsystem;

import java.util.Scanner;

/**
 *
 * @author 27790
 */
public class WarehouseReportingSystem {

    private static final int WEEKS = 4;
    private String[] categories = {"Shoes", "T-Shirts", "Hats"};
    private int[][] stock; // rows = categories,cols = weeks

    public WarehouseReportingSystem() {
        stock = new int[categories.length][WEEKS];
    }

    public void inputStock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items received for each category per week: ");

        for (int i = 0; i < categories.length; i++) {
            System.out.println("\nCategory: " + categories[i]);
            for (int week = 0; week < WEEKS; week++) {
                while (true) {
                    System.out.println("    Week " + (week + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        int qty = scanner.nextInt();
                        if (qty >= 0) {
                            stock[i][week] = qty;
                            break;
                        } else {
                            System.out.println("Quantity cannot be negative. Try Again.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter non-negative integer");
                        scanner.next();
                    }
                }
            }
        }
    }

    public int[] calculateWeeklyTotals() {
        int[] weeklyTotals = new int[WEEKS];
        for (int week = 0; week < WEEKS; week++) {
            int total = 0;
            for (int cat = 0; cat < categories.length; cat++) {
                total += stock[cat][week];
            }
            weeklyTotals[week] = total;

        }
        return weeklyTotals;
    }

    public void generateReport() {
        System.out.println("\nWAREHOUSE STOCK REPORT");
        System.out.printf("%-15s %5s %5s %5s %5s %7s%n", "Category", "Wk1", "Wk2", "Wk3", "Wk4", "Total");
        System.out.println("_____________________________________________________________");

        for (int i = 0; i < categories.length; i++) {
            int categoryTotal = 0;
            System.out.printf("%-15s", categories[i]);
            for (int week = 0; week < WEEKS; week++) {
                System.out.printf("%5d", stock[i][week]);
                categoryTotal += stock[i][week];
            }
            System.out.printf("%7d%n", categoryTotal);
        }
        int[] weeklyTotals = calculateWeeklyTotals();
        int grandTotal = 0;
        System.out.println("_____________________________________________________________");
        System.out.printf("%-15s", "Weekly Totals");
        for (int total = 0; total < weeklyTotals.length; total++) {
            System.out.printf("%5d", weeklyTotals[total]);
            grandTotal += weeklyTotals[total];

        }
        System.out.printf("%7d%n", grandTotal);
        System.out.println("_____________________________________________________________");
    }

    public static void main(String[] args) {
        WarehouseReportingSystem system = new WarehouseReportingSystem();
        system.inputStock();
        system.generateReport();
    }
}
