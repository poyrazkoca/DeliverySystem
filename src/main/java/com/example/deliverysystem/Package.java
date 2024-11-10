//-----------------------------------------------------
// Title: Package class
// Author: Poyraz Koca
// ID: 11867592942
// Section: 2
// Assignment: 1
// Description: This class represents a package with its ID and destination city.
//-----------------------------------------------------

package com.example.deliverysystem;

public class Package {
    private String id;
    private String destinationCity;

    //--------------------------------------------------------
    // Summary: Constructor that initializes a package with the given ID and destination city.
    // Precondition: Package ID is a valid string, destination city is a valid string.
    // Postcondition: A new Package object is created with the specified details.
    //--------------------------------------------------------
    public Package(String id, String destinationCity) {
        this.id = id;
        this.destinationCity = destinationCity;
    }

    //--------------------------------------------------------
    // Summary: Gets the ID of the package.
    // Precondition: The Package object is created.
    // Postcondition: Returns the package ID as a string.
    //--------------------------------------------------------
    public String getId() {
        return id;
    }

    //--------------------------------------------------------
    // Summary: Gets the destination city of the package.
    // Precondition: The Package object is created.
    // Postcondition: Returns the destination city as a string.
    //--------------------------------------------------------
    public String getDestinationCity() {
        return destinationCity;
    }
}
