/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rochelle.createemptyemployeesfile;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 *
 * @author 27790
 */
public class CreateEmptyEmployeesFile {

    public static void main(String[] args) {
       Path file = Paths.get("C:\\Users\\27790\\Desktop\\PROG6112\\JAVA\\CreateEmptyEmployeesFile\\RandomEmployees.txt");
       String s = "000,         ,00.00";
       System.getProperty("line.separator");
       byte[] data = s.getBytes();
       ByteBuffer buffer = ByteBuffer.wrap(data);
       final int NUMERICS = 1000;
       try{
           OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
           BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
           for(int i=0; i < NUMERICS; ++i){
               writer.write(s,0,s.length());  
           }
           writer.close();
       }catch(Exception e){
           System.out.println("Error: " + e); 
       }
               
    }
}
