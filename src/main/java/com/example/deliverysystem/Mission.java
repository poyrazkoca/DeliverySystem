//-----------------------------------------------------
// Title: Mission class
// Author: Poyraz Koca
// ID: 11867592942
// Section: 2
// Assignment: 1
// Description: This class represents a mission with start city, end city, via city, mission duration, number of stops, and package IDs.
//-----------------------------------------------------

package com.example.deliverysystem;

import java.util.List;

public class Mission {
    private String startCity;
    private String endCity;
    private String viaCity;
    private int missionDuration;
    private int numberOfStops;
    private List<Integer> packageIds;

    //--------------------------------------------------------
    // Summary: Constructor that initializes a mission with the given details.
    // Precondition: All arguments are valid (non-null strings for city names, valid integers for mission duration and stops).
    // Postcondition: A new Mission object is created with the specified details.
    //--------------------------------------------------------
    public Mission(String startCity, String endCity, String viaCity, int missionDuration, int numberOfStops, List<Integer> packageIds) {
        this.startCity = startCity;
        this.endCity = endCity;
        this.viaCity = viaCity;
        this.missionDuration = missionDuration;
        this.numberOfStops = numberOfStops;
        this.packageIds = packageIds;
    }

    public String getStartCity() {
        return startCity;
    }
    public String getEndCity() {
        return endCity;
    }
    public String getViaCity() {
        return viaCity;
    }
    public int getMissionDuration() {
        return missionDuration;
    }
    public int getNumberOfStops() {
        return numberOfStops;
    }
    public List<Integer> getPackageIds() {
        return packageIds;
    }
}
