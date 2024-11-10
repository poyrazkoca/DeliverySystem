//-----------------------------------------------------
// Title: DoublyLinkedList class
// Author: Poyraz Koca
// ID: 11867592942
// Section: 2
// Assignment: 1
// Description: A generic doubly linked list implementation.
//-----------------------------------------------------

package com.example.deliverysystem;

public class DoublyLinkedList<T> {

    // Node represents a single element in the doubly linked list.
    private class Node {
        T data;
        Node next;
        Node prev;

        //--------------------------------------------------------
        // Summary: Constructor that initializes a node with data.
        // Precondition: The data to be stored in the node.
        // Postcondition: A new node with the provided data is created.
        //--------------------------------------------------------
        Node(T data) {
            this.data = data;
        }
    }

    private Node head, tail;

    //--------------------------------------------------------
    // Summary: Adds a new node to the end of the list.
    // Precondition: The data to be added is valid and not null.
    // Postcondition: A new node with the provided data is added to the list.
    //--------------------------------------------------------
    public void enqueue(T data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        if (head == null) {
            head = tail;
        }
    }

    //--------------------------------------------------------
    // Summary: Removes the specified node from the list.
    // Precondition: The data to be removed is valid and exists in the list.
    // Postcondition: The node containing the specified data is removed from the list.
    //--------------------------------------------------------
    public void dequeue(T data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }
}
