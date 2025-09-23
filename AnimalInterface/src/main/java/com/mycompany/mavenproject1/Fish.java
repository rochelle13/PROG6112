/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/*
child class that extends parent class and implements 
appropriate interfaces - fish can only swim
 */
class Fish extends Animal implements Swimmable {

    //constructor
    public Fish(String name) {
        super(name, "Fish");
    }

    //methods that we override from interface
    @Override
    public void swim() {
        System.out.println(name + " is swimming gracefully through the water.");
    }

    @Override
    public void dive() {
        System.out.println(name + " dives deep into the water!");
    }
}
