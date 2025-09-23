/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/*
 child class that extends parent class and implements 
 appropriate interfaces - birds can fly and walk
 */
class Bird extends Animal implements Flyable, Walkable {

    //constructor
    public Bird(String name) {
        super(name, "Bird");
    }

    //methods that we override from interfaces 
    @Override
    public void fly() {
        System.out.println(name + " is flying through the sky");
    }

    @Override
    public void land() {
        System.out.println(name + " has landed");
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking on the ground");
    }

    @Override
    public void run() {
        System.out.println(name + " is running quickly!");
    }
}
