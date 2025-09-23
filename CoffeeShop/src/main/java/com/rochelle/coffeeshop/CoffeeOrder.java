/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rochelle.coffeeshop;

/**
 *
 * @author 27790
 */
//CoffeeOrder class with method to get coffee size
public class CoffeeOrder {
    private CoffeeSize size;
    
    public CoffeeOrder(CoffeeSize size) {
        this.size = size;
    }
    
    public CoffeeSize getSize() {
        return size;
    }
}
