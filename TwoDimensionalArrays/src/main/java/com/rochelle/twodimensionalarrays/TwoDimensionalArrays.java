/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.twodimensionalarrays;

import java.util.Scanner;

/**
 *
 * @author 27790
 */
public class TwoDimensionalArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Getting number of rows and columns from user 
        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int col = scanner.nextInt();

        //array declaration and intialization
        int[][] arr = new int[row][col];

        //User input to assign to arraay 
        System.out.println("Enter elements for the arrays: ");

        //loops through each row
        for (int i = 0; i < row; i++) {
            //loops through each column
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        //priting values of the array
        System.out.println("Elements of Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        //prints specific array element 
        System.out.println(arr[1][1]);
        scanner.close();
    }
}
