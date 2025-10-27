/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.fileinput;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 *
 * @author 27790
 */
public class FileInput {

    public static void main(String[] args) {

        Path file = Paths.get("C:\\Users\\27790\\Desktop\\PROG6112\\JAVA\\FileInput\\Document.txt");
        String s = "ABCDEF";
        byte[] data = s.getBytes();
        OutputStream output = null;
        try {
            //object is assigned to the reference
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.flush();
            output.close();
        } catch (Exception e) {
            System.out.println("Message: " + e);
        }
    }
}
