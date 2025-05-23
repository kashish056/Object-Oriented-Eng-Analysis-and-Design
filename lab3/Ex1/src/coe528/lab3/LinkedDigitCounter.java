/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author Kashish
 */
public class LinkedDigitCounter extends AbstractCounter {
    
        private final Counter leftNeighbor;

    public LinkedDigitCounter(Counter leftNeighbor) {
        this.leftNeighbor = leftNeighbor;
    }

    @Override
    public void increment() {
        if (value < 9) {
            value++;
        } else {
            value = 0;
            leftNeighbor.increment(); // Increment digit to the left
        }
    }

    @Override
    public void decrement() {
        if (value > 0) {
            value--;
        } else {
            value = 9;
            leftNeighbor.decrement(); // Decrement digit to the left
        }
    }
    
}
