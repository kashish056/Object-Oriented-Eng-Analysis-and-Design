/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab4;

import java.util.ArrayList;

/**
 *
 * @author kashish
 */
public class StackOfDistinctStrings {
// Overview: StacksOfDistinctStrings are mutable, bounded
// collection of distinct strings that operate in
// LIFO (Last-In-First-Out) order.
//
// The abstraction function is:
// a) Write the abstraction function here
// The abstraction function is:
// AF(items) = a stack where items.get(0) represents the top of the stack
//             and items.get(size-1) represents the bottom of the stack.
//             An empty stack is represented by an empty list.




// The rep invariant is:
// b) Write the rep invariant here
    
//   The rep invariant is:
//  1. items is not null.
//  2. All elements in items are non-null.
//  3. The stack does not contain duplicates.
//  4. The order of elements in items represents a valid LIFO order.




//the rep
private final ArrayList<String> items;

    // constructor
    public StackOfDistinctStrings() {
        // EFFECTS: Creates a new StackOfDistinctStrings object
        items = new ArrayList<>();
    }

    public void push(String element) throws Exception {
        // MODIFIES: this
        // EFFECTS: Appends the element at the top of the stack
        // if the element is not in the stack, otherwise does nothing.
        if (element == null) throw new Exception();
        if (!items.contains(element)) {
            items.add(element);
        }
    }

    public String pop() throws Exception {
        // MODIFIES: this
        // EFFECTS: Removes an element from the top of the stack
        if (items.isEmpty()) throw new Exception();
        return items.remove(items.size() - 1);
    }

    public boolean repOK() {
        // EFFECTS: Returns true if the rep invariant holds for this
        // object; otherwise returns false

        // Check 1: items is not null
        if (items == null) {
            return false;
        }

        // Check 2: All elements in items are non-null
        for (String element : items) {
            if (element == null) {
                return false;
            }
        }

        // Check 3: The stack does not contain duplicates
        for (int i = 0; i < items.size(); i++) {
            for (int j = i + 1; j < items.size(); j++) {
                if (items.get(i).equals(items.get(j))) {
                    return false; // Duplicate found
                }
            }
        }

        // Check 4: The order of elements in items represents a valid LIFO order
        // No specific check for LIFO order as it's implied by the way elements are added and removed

        // If all checks pass, return true
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        // EFFECTS: Returns a string that contains the strings in the
        // stack and the top element. Implements the abstraction function.

        StringBuilder result = new StringBuilder();
        for (String element : items) {
            result.append(element).append(" ");
        }
        return result.toString();
    }
}