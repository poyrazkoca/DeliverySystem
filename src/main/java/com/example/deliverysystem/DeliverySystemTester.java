//-----------------------------------------------------
// Title: DeliverySystemTester class
// Author: Poyraz Koca
// ID: 11867592942
// Section: 2
// Assignment: 1
// Description: Test cases for parsing data, package assignment, vehicle assignment and the output generation.
//-----------------------------------------------------

package com.example.deliverysystem;

import java.util.Arrays;

public class DeliverySystemTester {

    //--------------------------------------------------------
    // Summary: The main entry point of the DeliverySystemTester class.
    //          This method tests various functionalities of the system,
    //          such as creating cities, packages, adding/removing from
    //          a queue, creating vehicles, and creating missions.
    // Precondition: None
    // Postcondition: This method will create objects for cities, packages,
    //                vehicles, and missions and display the results.
    //--------------------------------------------------------
    public static void main(String[] args) {

        // ----------------------------------------------------
        // Creating some city objects
        // City city1 represents "New York" and city2 represents "Los Angeles"
        // ----------------------------------------------------
        City city1 = new City("New York");
        City city2 = new City("Los Angeles");

        // ----------------------------------------------------
        // Creating package objects
        // Package package1 represents a package from "New York" and package2
        // represents a package from "Los Angeles"
        // ----------------------------------------------------
        Package package1 = new Package("PKG001", "New York");
        Package package2 = new Package("PKG002", "Los Angeles");

        // ----------------------------------------------------
        // Creating a Queue object to hold packages
        // Adding package1 and package2 to the package queue
        // ----------------------------------------------------
        Queue<Package> packageQueue = new Queue<>();
        packageQueue.add(package1);  // Add the first package to the queue
        packageQueue.add(package2);  // Add the second package to the queue

        // ----------------------------------------------------
        // Removing a package from the queue to test the 'remove' method
        // The removed package's ID is printed to verify correctness
        // ----------------------------------------------------
        Package removedPackage = packageQueue.remove();
        System.out.println("Removed Package ID: " + removedPackage.getId()); // Output the ID of the removed package

        // ----------------------------------------------------
        // Creating some vehicle objects
        // Vehicle vehicle1 represents a vehicle starting in "New York" with a capacity of 500
        // Vehicle vehicle2 represents a vehicle starting in "Los Angeles" with a capacity of 600
        // ----------------------------------------------------
        Vehicle vehicle1 = new Vehicle("VEH001", "New York", 500);
        Vehicle vehicle2 = new Vehicle("VEH002", "Los Angeles", 600);

        // ----------------------------------------------------
        // Creating a mission object with specified start city, end city, via city,
        // mission duration, number of stops, and the list of package IDs
        // ----------------------------------------------------
        Mission mission = new Mission("New York", "Los Angeles", "Chicago", 10, 2, Arrays.asList(1, 2));

        // ----------------------------------------------------
        // Displaying the details of the created mission
        // Outputting the start city, end city, via city, mission duration,
        // number of stops, and the package IDs associated with this mission
        // ----------------------------------------------------
        System.out.println("Mission from " + mission.getStartCity() + " to " + mission.getEndCity());
        System.out.println("Via city: " + mission.getViaCity());
        System.out.println("Mission Duration: " + mission.getMissionDuration() + " hours");
        System.out.println("Number of stops: " + mission.getNumberOfStops());
        System.out.println("Package IDs: " + mission.getPackageIds());
    }
}
