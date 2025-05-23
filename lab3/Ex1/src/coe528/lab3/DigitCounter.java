/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author Kashish
 */
public class DigitCounter extends AbstractCounter {
        
     public DigitCounter() {
        super(); // Call the constructor of the superclass to initialize the value to 0.
    }

    @Override
    public void increment() {
        if (value < 9) {
            value++;
        } else {
            value = 0;
            // No need to increment digit to the left for DigitCounter
        }
    }

    @Override
    public void decrement() {
        if (value > 0) {
            value--;
        } else {
            value = 9;
            // No need to decrement digit to the left for DigitCounter
        }
    }
    
    
}
