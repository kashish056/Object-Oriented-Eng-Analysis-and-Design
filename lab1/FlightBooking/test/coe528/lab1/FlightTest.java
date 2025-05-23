/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe528.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author janki
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     public void testConstructor(){
        System.out.println("Constructor");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", 
                "03/02/99 7:50 pm", 150, 1000);
        String expResult = "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000.0$";
        assertEquals(expResult, instance.toString());
    }  
    
    @Test (expected =IllegalArgumentException.class)
    public void testInvalidConstructor(Class<IllegalArgumentException> expected){
        System.out.println("Constructor Fail");
        Flight instance = new Flight(1030, "Toronto", "Toronto", 
                "03/02/99 7:50 pm", 150, 1000);
    }
    
    @Test
    public void testBookASeat(){
        System.out.println("testBookASeat");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", 
                "03/02/99 7:50 pm", 150, 1000);
        assertTrue(instance.bookASeat());
    }
    
    @Test
    public void testSettersAndGetters(){
        System.out.println("testSettersAndGetters");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", 
                "03/02/99 7:50 pm", 150, 1000);
        instance.setFlightNumber(10);
        instance.setOrigin("Tokyo");
        instance.setDestination("Shanghai");
        instance.setDepartureTime("1/01/11 11:11 am");
        instance.setCapacity(175);
        instance.setOriginalPrice(200);
        instance.setNumberOfSeatsLeft(100);
        
        assertEquals(10, instance.getFlightNumber());
        assertEquals("Tokyo", instance.getOrigin());
        assertEquals("Shanghai", instance.getDestination());
        assertEquals("1/01/11 11:11 am", instance.getDepartureTime());
        assertEquals(175, instance.getCapacity());
        assertEquals(200.0, instance.getOriginalPrice(), 0.01);
        assertEquals(100, instance.getNumberOfSeatsLeft());
    }
}

