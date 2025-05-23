/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author Kashish
 */
// Odometer.java
public class Odometer implements Counter {
    
    private int numberOfDigits; // Stores number of digits
    private Counter digits[]; // Array of all LinkedDigitCounters and DigitCounters
    
    // Constructor
    Odometer(int n) {
        if (n < 1) {
            System.out.println("Incorrect number of odometer digits");
            // Additional handling if needed, such as setting a default value for n
        } else {
            this.numberOfDigits = n;
            digits = new Counter[n];
            digits[0] = new DigitCounter();

            // Loop to initialize LinkedDigitCounters
            for (int i = 1; i < n; i++) {
                digits[i] = new LinkedDigitCounter(digits[i - 1]);
            }
        }
    }
    
    // Output the current value of the counter as a string of digits
    @Override
public String count() {
    StringBuilder output = new StringBuilder();

    for (int i = 0; i < numberOfDigits; i++) {
        output.append(digits[i].count());
        // Add all string values together
    }

    return output.toString();
}

    @Override
    public void increment() {
        digits[numberOfDigits - 1].increment();
        // Increments right-most digit
    }

    @Override
    public void decrement() {
        digits[numberOfDigits - 1].decrement();
        // Decrements right-most digit 
    }

    // Reset the counter
    @Override
    public void reset() {
        for (int i = 0; i < numberOfDigits; i++) {
            digits[i].reset();
            // Resets all digits of the odometer
        }
    }  
}