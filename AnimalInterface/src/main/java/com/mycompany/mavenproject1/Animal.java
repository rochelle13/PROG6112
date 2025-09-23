/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lab_services_student
 */
//abstract Animal class - base/parent class
abstract class Animal {

    //variables 
    protected String name;
    protected String species;

    //constructor
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    //methods for parent class - child class will inherit these methods 
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
       return name;
    }
}
