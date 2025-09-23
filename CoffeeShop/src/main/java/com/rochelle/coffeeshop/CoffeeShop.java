/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.coffeeshop;

/**
 *
 * @author 27790
 */
public class CoffeeShop {

    public static void main(String[] args) {

        // Creating a new coffee order for a medium coffee
        CoffeeOrder myOrder = new CoffeeOrder(CoffeeSize.MEDIUM);

        // Getting the size of the order
        CoffeeSize orderSize = myOrder.getSize();

        // Using the enum in a switch statement
        switch (orderSize) {
            case SMALL:
                System.out.println("The coffee is small.");
                break;
            case MEDIUM:
                System.out.println("The coffee is medium.");
                break;
            case LARGE:
                System.out.println("The coffee is large.");
                break;
        }
    }
}
