/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.readfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 

/**
 *
 * @author 27790
 */
public class ReadFile {

    public static void main(String[] args) {
        /*
        Creates a Path object representing the location of your text file on 
        the hard drive. Paths.get() converts the string path into a Path object 
        that Java can work with
        */
        Path file = Paths.get("C:\\Users\\27790\\Desktop\\PROG6112\\JAVA\\ReadFile\\MyFile.txt");
        /*
        Declares an InputStream variable called input and initializes it to 
        null. This will be used to read raw bytes from the file
        */
        InputStream input = null;
        /*
         try-catch block to handle any potential IOException that might 
        occur during file operations (like if the file doesn't exist or can't be read)
        */
        try {
            //Opens an input stream to read from the file
            input = Files.newInputStream(file);
            //InputStreamReader converts raw bytes into characters
            //BufferedReader adds buffering for efficient reading
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            //This will store the line read from the file
            String s = null;
            //Reads one line of text from the file
            s = reader.readLine();
            System.out.println(s);
            //Closes the input stream, releasing the system resources associated with the file
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
