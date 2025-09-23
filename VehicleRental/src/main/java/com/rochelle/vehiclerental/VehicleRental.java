/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.vehiclerental;

/**
 *
 * @author 27790
 */
public class VehicleRental {

    public static void main(String[] args) {
        //create array of vehicles
        Vehicle[] fleet = {
            new Bike("BIKE123", "Harley Davidson", 350.0, 1200, false),
            new Car("ABC123", "BMW", 450.0, 4, "Petrol"),
            new Car("DEF123", "TOYOTA", 250.0, 4, "Petrol")

        };

        System.out.println("VEHICLE RENTAL SYSTEM");

        //displays all available vehicles
        System.out.println("Available Vehicles: ");
        for (int i = 0; i < fleet.length; i++) {
            Vehicle vehicle = fleet[i];
            if (vehicle.isAvailable()) {
                vehicle.displaySpecifications();
                System.out.println();
            }
        }

        //demonstrate rental operations
        System.out.println("RENTAL OPERATIONS");
        //Renting a car for 5 days 
        Vehicle car = fleet[1];
        car.rent();
        double carCost = car.calculateRentalCost(5);
        System.out.println("5 day rental costs for " + car.getVehicleType() + ": R" + carCost);
        System.out.println("Max passengers: " + car.getMaxPassengers() + "\n");

        //Rent a bike for 10 days - user gets a discount
        Vehicle bike = fleet[0];
        bike.rent();
        double bikeCost = bike.calculateRentalCost(10);
        System.out.println("10 day rental costs for " + bike.getVehicleType() + ": R" + bikeCost);
        System.out.println("Max passengers: " + bike.getMaxPassengers());
        System.out.println("Note: Bike gets 15% discount for rentals > 7 days\n");

        //Try to rent already rented vehicle 
        System.out.println("ATTEMPTING TO TRENT ALREADY RENTED VEHICLE");
        car.rent(); // displays error message 

        //return vehicles
        System.out.println("RETURN VEHICLES");
        car.returnVehicle();
        bike.returnVehicle();

        //Demonstrate polymorphism
        System.out.println("POLYMORPHISM DEMONSTRATION");
        System.out.println("Processing all vehicle polymorphically");
        for (int i = 0; i < fleet.length; i++) {
            Vehicle v = fleet[i];
            System.out.println(v.getVehicleType() + " (" + v.getLicensePlate()
                    + ") - 7 day cost: R" + v.calculateRentalCost(7));
        }

    }

}
