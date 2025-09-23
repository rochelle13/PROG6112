/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rochelle.vehiclerental;

/**
 *
 * @author 27790
 */
//subclass for bikes - child class
class Bike extends Vehicle {

    //variables
    private int engineSize;
    private boolean hasSideCar;

    //constructor
    public Bike(String licensePlate, String brand, double dailyRate, int engineSize, boolean hasSideCar) {
        super(licensePlate, brand, dailyRate);
        this.engineSize = engineSize;
        this.hasSideCar = hasSideCar;
    }

    //overriden methods from parent class
    @Override
    public double calculateRentalCost(int days) {
        //bikes get a discount for longer rentals
        double discount = 0;
        if (days > 7) {
            discount = (dailyRate * days) * 0.15;
            return (dailyRate * days) - discount;
        } else {
            return dailyRate * days;
        }
    }

    @Override
    public void displaySpecifications() {
        System.out.println("-----------BIKE SPECIFICATIONS-----------");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Brand: " + brand);
        System.out.println("Engine Size: " + engineSize + "cc");
        if (hasSideCar) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("Daily Rate: R" + dailyRate);
        if (isRented) {
            System.out.println("Status: RENTED");
        } else {
            System.out.println("Status: AVAILABLE");
        }
    }

    @Override
    public String getVehicleType() {
        return "Bike";
    }

    @Override
    public int getMaxPassengers() {
        if (hasSideCar) {
            return 2;
        } else {
            return 1;
        }

    }
}
