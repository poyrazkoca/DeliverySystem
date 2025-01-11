# Cargo Delivery Simulation Program #
This Java program simulates cargo delivery operations between distribution centers for a shipping company. The program uses custom implementations of doubly linked lists, stacks, and queues to model cargo packages and delivery vehicles, with each city having a distribution center to manage these resources.

The program reads from input files to initialize the state of cities, packages, and vehicles and then processes a series of missions. Each mission involves selecting a vehicle, loading it with cargo packages, and following a specified route between cities. The final status of each distribution center is saved to an output file.

# Requirements
Java (JDK 8 or higher)
This program is self-contained and does not use external libraries or .jar files.
The program uses linked-list-based implementations of doubly linked lists, stacks, and queues with Java generics, inspired by textbook examples.
Input Files
cities.txt: Contains information on cities that act as possible destinations in the simulation. Each city has a distribution center with its initial state of cargo packages and delivery vehicles.
packages.txt: Shows the initial configuration of cargo packages at each distribution center.
vehicles.txt: Lists the initial state of delivery vehicles in each city.
missions.txt: Lists the missions that need to be completed, including the sequence of cities, package load/unload instructions, and specific cargo packages to drop off at designated locations.

# Program Workflow
Initialize Distribution Centers: Parse cities.txt, packages.txt, and vehicles.txt to set up initial states for cities, packages, and vehicles.
Process Missions:
Select and load the first available vehicle from the source distribution center.
Load cargo packages from the source and middle distribution centers as specified.
Drop off specific cargo packages at the middle distribution center based on their indices.
Place the vehicle and remaining cargo packages at the destination distribution center.
Output: After all missions are completed, generate result.txt with the final status of all distribution centers.

# Data Structures
Doubly Linked List: Used to model both cargo packages and delivery vehicles.
Stack: Models the LIFO behavior of cargo packages at distribution centers.
Queue: Models the FIFO access to vehicles in each distribution center's central warehouse.

# Notes
Make sure the input files are in the same directory as the program, or provide absolute paths.
The program follows strict sequence rules for loading and unloading cargo packages, respecting LIFO and FIFO principles where applicable.
