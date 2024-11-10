//-----------------------------------------------------
// Title: Stack class
// Author: Poyraz Koca
// ID: 11867592942
// Section: 2
// Assignment: 1
// Description: A generic stack implementation using linked list.
//-----------------------------------------------------

package com.example.deliverysystem;

public class Stack<T> {

    // Node represents a single element in the stack.
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

    private Node<T> top;

    //--------------------------------------------------------
    // Summary: Adds an element to the top of the stack.
    // Precondition: The data to be added is valid and not null.
    // Postcondition: The data is pushed onto the stack.
    //--------------------------------------------------------
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    //--------------------------------------------------------
    // Summary: Removes the top element of the stack.
    // Precondition: The stack is not empty.
    // Postcondition: The top element is removed from the stack and returned.
    //--------------------------------------------------------
    public T pop() {
        if (top == null) return null;

        T data = top.data;
        top = top.next;
        return data;
    }

    //--------------------------------------------------------
    // Summary: Returns the top element of the stack without removing it.
    // Precondition: The stack is not empty.
    // Postcondition: Returns the top element without modifying the stack.
    //--------------------------------------------------------
    public T peek() {
        return top != null ? top.data : null;
    }

    //--------------------------------------------------------
    // Summary: Checks if the stack is empty.
    // Precondition: None.
    // Postcondition: Returns true if the stack is empty, false otherwise.
    //--------------------------------------------------------
    public boolean isEmpty() {
        return top == null;
    }
}
