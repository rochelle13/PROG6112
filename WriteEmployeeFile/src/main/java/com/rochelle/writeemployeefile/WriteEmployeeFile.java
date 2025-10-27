/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.writeemployeefile;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author 27790
 */
public class WriteEmployeeFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get file path
        Path file = Paths.get("C:\\Users\\27790\\Desktop\\PROG6112\\JAVA\\WriteEmployeeFile\\Employees.txt");
        //declare and assign variables
        String s = "";
        //used to separate values in textfile
        String delimiter = ",";
        int id;
        String name;
        double payRate;
        //use to quit application
        final int QUIT = 999;
        try {
            //declare an output stream
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            //get input from user
            System.out.println("Enter employee ID number >> ");
            id = input.nextInt();
            //loops until 999 is entered 
            while (id != QUIT) {
                System.out.println("Enter name of employee no " + id + " >> ");
                input.nextLine();
                name = input.nextLine();
                System.out.println("Enter pay rate >> ");
                payRate = input.nextDouble();
                //string to add to file 
                s = id + delimiter + name + delimiter + payRate;
                //writes to file
                writer.write(s, 0, s.length());
                writer.newLine();
                System.out.println("Enter next ID number or " + QUIT + " to quit >> ");
                id = input.nextInt();
            }
            writer.close();

        } catch (Exception e) {
            System.out.println("Message: " + e);

        }
    }
}
