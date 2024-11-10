//-----------------------------------------------------
// Title: Main class
// Author: Poyraz Koca
// ID: 11867592942
// Section: 2
// Assignment: 1
// Description: This class handles the main execution of the delivery system, parsing input files, and printing the results.
//-----------------------------------------------------

package com.example.deliverysystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    //--------------------------------------------------------
    // Summary: The main method that drives the program.
    // Precondition: Cities, packages, and vehicles are provided in input files.
    // Postcondition: For each city, prints the associated packages and vehicles.
    //--------------------------------------------------------
    public static void main(String[] args) {
        // Parse data from input files
        List<City> cities = parseCities("cities.txt");
        List<Package> packages = parsePackages("packages.txt");
        List<Vehicle> vehicles = parseVehicles("vehicles.txt");

        // For each city, print its name, the packages, and the vehicles in the specified format
        for (City city : cities) {
            System.out.println(city.getName());
            System.out.println("Packages:");

            // Print packages for this city
            for (Package pkg : packages) {
                if (pkg.getDestinationCity().equals(city.getName())) {
                    System.out.println(pkg.getId());
                }
            }

            System.out.println("Vehicles:");
            // Print vehicles for this city
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getLocation().equals(city.getName())) {
                    System.out.println(vehicle.getId());
                }
            }

            System.out.println("-------------");
        }
    }

    //--------------------------------------------------------
    // Summary: Method to parse cities from a text file.
    // Precondition: A file with city names exists.
    // Postcondition: A list of City objects is created and returned.
    //--------------------------------------------------------
    private static List<City> parseCities(String filename) {
        List<City> cities = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String cityName = scanner.nextLine().trim();
                cities.add(new City(cityName));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File " + filename + " not found.");
        }
        return cities;
    }

    //--------------------------------------------------------
    // Summary: Method to parse packages from a text file.
    // Precondition: A file with package details exists.
    // Postcondition: A list of Package objects is created and returned.
    //--------------------------------------------------------
    private static List<Package> parsePackages(String filename) {
        List<Package> packages = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().trim().split(" ");
                String packageId = parts[0];
                String destinationCity = parts[1];
                packages.add(new Package(packageId, destinationCity));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File " + filename + " not found.");
        }
        return packages;
    }

    //--------------------------------------------------------
    // Summary: Method to parse vehicles from a text file.
    // Precondition: A file with vehicle details exists.
    // Postcondition: A list of Vehicle objects is created and returned.
    //--------------------------------------------------------
    private static List<Vehicle> parseVehicles(String filename) {
        List<Vehicle> vehicles = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().trim().split(" ");
                String vehicleId = parts[0];
                String location = parts[1];
                double capacity = Double.parseDouble(parts[2]);
                vehicles.add(new Vehicle(vehicleId, location, capacity));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File " + filename + " not found.");
        }
        return vehicles;
    }
}
