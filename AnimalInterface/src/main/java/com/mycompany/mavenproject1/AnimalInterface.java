/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

/**
 * Interfaces define what an object can do 
 * Classes define how objects do things
 * One class can implement multiple interfaces 
 * Interfaces allow for polymorphism
 */
public class AnimalInterface {

    //This method can work with any animal that implements the flyable inferface
    public static void makeItFly(Flyable flyer) {
        flyer.fly();
        flyer.land();
    }

    //This method can work with any animal that implements the walkable inferface
    public static void makeItWalk(Walkable walker) {
        walker.walk();
        walker.run();
    }

    //This method can work with any animal that implements the swimmable inferface
    public static void makeItSwim(Swimmable swimmer) {
        swimmer.swim();
        swimmer.dive();
    }

    public static void main(String[] args) {
        System.out.println("-------ANIMAL INTERFACE DEMONSTRATION-------");

        //Create different animals
        Bird eagle = new Bird("Bald");
        Fish goldfish = new Fish("Nemo");
        Dog retriever = new Dog("Prince");
        Penguin penguin = new Penguin("Skipper");

        //demonstration of polymorphism with inheritance
        System.out.println("FLYING ANIMALS");
        System.out.println("------------------------------------");
        //this method works because the class Bird implements the interface Flyable
        makeItFly(eagle);
        //makeitFly(retriever); - this would cause a compile error

        System.out.println("SWIMMING ANIMALS");
        System.out.println("------------------------------------");
        makeItSwim(goldfish);
        makeItSwim(retriever);
        makeItSwim(penguin);

        System.out.println("WALKING ANIMALS");
        System.out.println("------------------------------------");
        makeItWalk(eagle);
        makeItWalk(retriever);
        makeItWalk(penguin);

        //Demonstrates that animals can have unique behaviors
        //only and object of the dog class can use this method
        System.out.println("UNIQUE BEHAVIOURS");
        System.out.println("------------------------------------");
        retriever.bark();

        //Demonstrated that all animals inherit from the Animal Class
        System.out.println("COMMON BEHAVIOURS (from animals class)");
        System.out.println("------------------------------------");
        eagle.eat();
        goldfish.sleep();
    }
}
