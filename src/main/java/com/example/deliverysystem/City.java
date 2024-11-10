//-----------------------------------------------------
// Title: City class
// Author: Poyraz Koca
// ID: 11867592942
// Section: 2
// Assignment: 1
// Description: This class represents a city with its name.
//-----------------------------------------------------

package com.example.deliverysystem;

public class City {
    private String name;

    //--------------------------------------------------------
    // Summary: Constructor that initializes the name of the city.
    // Precondition: The name should be a valid string representing a city.
    // Postcondition: A new City object is created with the specified name.
    //--------------------------------------------------------
    public City(String name) {
        this.name = name;
    }

    //--------------------------------------------------------
    // Summary: Gets the name of the city.
    // Precondition: The City object is created.
    // Postcondition: Returns the name of the city as a string.
    //--------------------------------------------------------
    public String getName() {
        return name;
    }
}

