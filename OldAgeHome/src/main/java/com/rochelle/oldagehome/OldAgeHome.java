/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.oldagehome;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 27790
 */
public class OldAgeHome {

    //initializes room occupancy 
    public static void initializeRooms(boolean[][][] rooms) {
        Random rand = new Random();
        for (int b = 0; b < rooms.length; b++) {
            for (int f = 0; f < rooms[b].length; f++) {
                for (int r = 0; r < rooms[b][f].length; r++) {
                    rooms[b][f][r] = rand.nextBoolean();
                }
            }
        }
    }

    //shows empty rooms for a sepcific floor 
    public static void emptyRooms(boolean[][][] rooms, int b, int f) {
        System.out.println("\nEmpty rooms in Building " + (b + 1) + " ,Floor "
                + (f + 1) + ":");
        for (int r = 0; r < rooms[b][f].length; r++) {
            if (!rooms[b][f][r]) {
                System.out.println("Rooms " + (r + 1) + "is EMPTY");
            }
        }
    }

    //prints a summary
    public static void printSummary(boolean[][][] rooms) {
        int totalRooms = 0;
        int totalOccupied = 0;

        for (int b = 0; b < rooms.length; b++) {
            int buildingOccupied = 0;
            for (int f = 0; f < rooms[b].length; f++) {
                for (int r = 0; r < rooms[b][f].length; r++) {
                    totalRooms++;
                    if (rooms[b][f][r]) {
                        totalOccupied++;
                        buildingOccupied++;
                    }
                }
            }
            System.out.println("Building " + (b + 1)
                    + " Occupied Rooms: " + buildingOccupied);
        }
        System.out.println("\nTOTAL ROOMS: " + totalRooms);
        System.out.println("OCCUPIED: " + totalOccupied);
        System.out.println("EMPTY: " + (totalRooms - totalOccupied));
    }

    // Print a visual map for a floor
    public static void printMap(boolean[][][] rooms, int b, int f) {
        System.out.println("\nFloor Map for Building " + (b + 1) + ", Floor " + (f + 1) + ":");
        for (int r = 0; r < rooms[b][f].length; r++) {
            System.out.print(rooms[b][f][r] ? "O " : "E ");
        }
        System.out.println("\nLegend: O = Occupied, E = Empty");
    }

    public static void main(String[] args) {
        // 3 buildings, 4 floors each, 5 rooms per floor
        boolean[][][] rooms = new boolean[3][4][5];
        initializeRooms(rooms);
        boolean menu = true;

        Scanner scanner = new Scanner(System.in);
        int choice, building, floor;

        while (menu) {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Show empty rooms on a floor");
            System.out.println("2. View occupancy summary");
            System.out.println("3. Print visual floor map");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter building number (1-3): ");
                    building = scanner.nextInt() - 1;
                    System.out.print("Enter floor number (1-4): ");
                    floor = scanner.nextInt() - 1;
                    emptyRooms(rooms, building, floor);
                    break;
                case 2:
                    printSummary(rooms);
                    break;
                case 3:
                    System.out.print("Enter building number (1-3): ");
                    building = scanner.nextInt() - 1;
                    System.out.print("Enter floor number (1-4): ");
                    floor = scanner.nextInt() - 1;
                    printMap(rooms, building, floor);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    menu = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        }

        scanner.close();
    }

}
