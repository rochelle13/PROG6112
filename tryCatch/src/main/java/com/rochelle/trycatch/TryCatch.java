/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 27790
 */
public class TryCatch {


    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        
        while (!validInput){
            try{
                System.out.println("Enter a number");
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                validInput = true;
            }catch(InputMismatchException e){
                System.out.println("Invalid Input: " + e.getMessage());
                System.out.println("Please enter a valid number");
                scanner.nextLine();
                
            }
        }
    }
}
