//-----------------------------------------------------
// Title: Queue class
// Author: Poyraz Koca
// ID: 11867592942
// Section: 2
// Assignment: 1
// Description: A generic queue implementation using linked list.
//-----------------------------------------------------

package com.example.deliverysystem;

public class Queue<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        //--------------------------------------------------------
        // Summary: Constructor that initializes a node with data.
        // Precondition: The data to be stored in the node.
        // Postcondition: A new node with the provided data is created.
        //--------------------------------------------------------
        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> front, rear;

    //--------------------------------------------------------
    // Summary: Adds an element to the end of the queue.
    // Precondition: The data to be added is valid and not null.
    // Postcondition: The data is added to the queue.
    //--------------------------------------------------------
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
    }

    //--------------------------------------------------------
    // Summary: Removes the front element of the queue.
    // Precondition: The queue is not empty.
    // Postcondition: The front element is removed from the queue.
    //--------------------------------------------------------
    public T remove() {
        if (front == null) return null;

        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }
}
