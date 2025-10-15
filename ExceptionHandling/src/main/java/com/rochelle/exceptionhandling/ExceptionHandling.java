/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.exceptionhandling;

/**
 *
 * @author 27790
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        //variables
        /*int a = 10;
        int b = 2;

        try {
            int ans = a / b;
            System.out.println("Answer: " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Error: Can't divide by 0");
        }
*/
        
        int[] numbers = {10,20,30,40};
        
        try{
        System.out.println(numbers[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e);    
        }finally{
            System.out.println("finally block has been executed");
        }
        System.out.println("END OF PROGRAM");
    }

}
