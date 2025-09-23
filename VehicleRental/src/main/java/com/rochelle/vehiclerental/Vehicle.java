/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rochelle.vehiclerental;

/**
 *
 * @author 27790
 */
//abstract base class for  vehicles - parent class
abstract class Vehicle {

    //variables
    protected String licensePlate;
    protected String brand;
    protected double dailyRate;
    protected boolean isRented;

    //constructor
    public Vehicle(String licensePlate, String brand, double dailyRate) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.dailyRate = dailyRate;
        this.isRented = false;
    }

    //concrete methods that all vehicles share
    public void rent() {
        if (isRented) {
            System.out.println("Vehicle " + licensePlate + " is already rented!");
        } else {
            isRented = true;
            System.out.println("Vehicle " + licensePlate + " has been rented!");
        }
    }
    
    public void returnVehicle(){
         if (!isRented) {
            System.out.println("Vehicle " + licensePlate + " is not currently rented!");
        } else {
            isRented = false;
            System.out.println("Vehicle " + licensePlate + " has been returned!");
        }
    }

    public boolean isAvailable() {
        return !isRented;
    }

    //Getters
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public double getDailyRate() {
        return dailyRate;
    }
    
    //Abstract methods that are implemented by subclasses 
    public abstract double calculateRentalCost(int days);
    public abstract void displaySpecifications();
    public abstract String getVehicleType();
    public abstract int getMaxPassengers();

}
