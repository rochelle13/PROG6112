/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rochelle.vehiclerental;

/**
 *
 * @author 27790
 */
//subclass for cars - child class
class Car extends Vehicle {

    //variables
    private int numberOfDoors;
    private String fuelType;

    //constructor
    public Car(String licensePlate, String brand, double dailyRate, int numberOfDoors, String fuelType) {
        super(licensePlate, brand, dailyRate);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    //overriden methods from parent class
    @Override
    public double calculateRentalCost(int days) {
        //cars have standard daily rates
        return dailyRate * days;
    }

    @Override
    public void displaySpecifications() {
        System.out.println("-----------CAR SPECIFICATIONS-----------");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Brand: " + brand);
        System.out.println("Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Daily Rate: R" + dailyRate);
        if (isRented) {
            System.out.println("Status: RENTED");
        } else {
            System.out.println("Status: AVAILABLE");
        }
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }

    @Override
    public int getMaxPassengers() {
        if (numberOfDoors == 2) {
            return 2;
        } else {
            return 5;
        }
    }

}
