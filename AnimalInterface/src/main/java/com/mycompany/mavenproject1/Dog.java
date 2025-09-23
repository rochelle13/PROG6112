/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/*
child class that extends parent class and implements 
appropriate interfaces - dogs can walk and swim
 */
class Dog extends Animal implements Walkable, Swimmable {

    //constructor
    public Dog(String name) {
        super(name, "Dog");
    }

    //methods that we override from interfaces 
    @Override
    public void walk() {
        System.out.println(name + "is walking and wagging his tail");
    }

    @Override
    public void run() {
        System.out.println(name + "running to chase Aiden");
    }

    @Override
    public void dive() {
        System.out.println(name + "dives into the pool");
    }

    @Override
    public void swim() {
        System.out.println(name + "is doing the doggy paddle");
    }

    //a special method that can only be accessed by the Dog class
    public void bark() {
        System.out.println(name + "says woof!");
    }
}
