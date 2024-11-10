//-----------------------------------------------------
// Title: Vehicle class
// Author: Poyraz Koca
// ID: 11867592942
// Section: 2
// Assignment: 1
// Description: This class represents a vehicle with its ID, location, and capacity.
//-----------------------------------------------------

package com.example.deliverysystem;

public class Vehicle {
    private String id;
    private String location;
    private double capacity;

    //--------------------------------------------------------
    // Summary: Constructor that initializes a vehicle with the given details.
    // Precondition: Vehicle ID is a valid string, location is a valid string, capacity is a positive number.
    // Postcondition: A new Vehicle object is created with the specified details.
    //--------------------------------------------------------
    public Vehicle(String id, String location, double capacity) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
    }

    //--------------------------------------------------------
    // Summary: Gets the ID of the vehicle.
    // Precondition: The Vehicle object is created.
    // Postcondition: Returns the vehicle ID as a string.
    //--------------------------------------------------------
    public String getId() {
        return id;
    }

    //--------------------------------------------------------
    // Summary: Gets the location of the vehicle.
    // Precondition: The Vehicle object is created.
    // Postcondition: Returns the vehicle location as a string.
    //--------------------------------------------------------
    public String getLocation() {
        return location;
    }

    //--------------------------------------------------------
    // Summary: Gets the capacity of the vehicle.
    // Precondition: The Vehicle object is created.
    // Postcondition: Returns the vehicle capacity as a double.
    //--------------------------------------------------------
    public double getCapacity() {
        return capacity;
    }
}
