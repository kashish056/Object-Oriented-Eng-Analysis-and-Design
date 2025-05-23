/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author Kashish
 */
public abstract class AbstractCounter implements Counter {
     
        // AbstractCounter.java

    protected int value;

    // Constructor to initialize the value to 0
    public AbstractCounter() {
        this.value = 0;
    }

    @Override
    public String count() {
        return Integer.toString(value);
    }

    @Override
    public void increment() {
        value++;
    }

    @Override
    public void decrement() {
        value--;
    }

    @Override
    public void reset() {
        value = 0;
    }
}

    
    

