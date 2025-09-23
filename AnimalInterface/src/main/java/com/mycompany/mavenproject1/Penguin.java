/*
 *Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/*
child class that extends parent class and implements 
appropriate interfaces - penguins can swim and walk
 */
class Penguin extends Animal implements Swimmable, Walkable {

    //constructor
    public Penguin(String name) {
        super(name, "Penguin");
    }

    //methods we override from interfaces
    @Override
    public void swim() {
        System.out.println(name + "is swimming in the water");
    }

    @Override
    public void dive() {
        System.out.println(name + " dives deep to catch fish");
    }

    @Override
    public void walk() {
        System.out.println(name + " is waddling across the ice");
    }

    @Override
    public void run() {
        System.out.println(name + " is sliding on it's belly - that's how penguins run");
    }

}
