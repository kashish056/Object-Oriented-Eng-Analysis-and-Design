package coe528.lab4;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kashish
 * @param <T>
 */
public class Queue<T> {
    private final ArrayList<T> elements;

    public Queue() {
        // Constructor: Initializes the queue as an empty ArrayList
        elements = new ArrayList<>();
    }

    public void enqueue(T element) {
        // Enqueue: Adds an element to the end of the queue
        elements.add(element);
    }

    public T dequeue() {
        // Dequeue: Removes and returns the element from the front of the queue
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty queue");
        }
        return elements.remove(0);
    }

    public boolean isEmpty() {
        // Check if the queue is empty
        return elements.isEmpty();
    }
    
    /**
     * Representation Invariant : the element ArrayList must not be null and must not contain any null elements.
     * @return true if the representation invariant holds, false otherwise.
     */
    public boolean repOK() {
        return elements != null && !elements.contains(null);
    }



    @Override
    public String toString() {
        // String representation of the queue
        return elements.toString();
    }
    
    

    public static void main(String[] args) {
        // Test the queue implementation
        Queue<Integer> queue = new Queue<>();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Dequeue elements
        int dequeuedElement1 = queue.dequeue();
        int dequeuedElement2 = queue.dequeue();

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();

        // Print results
        System.out.println("Dequeued element 1: " + dequeuedElement1);
        System.out.println("Dequeued element 2: " + dequeuedElement2);
        System.out.println("Is the queue empty? " + isEmpty);
    }
}
