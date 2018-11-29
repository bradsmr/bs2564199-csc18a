// This Unit Test is only for you to test/check your progress on completing
// the SnowboardRental class.
//
// YOU ARE NOT TO MODIFY THE CONTENTS OF THIS FILE - DO SO WILL RESULT IN A ZERO
// FOR THE RESPECTIVE CLASS THIS UNIT TEST BELONGS TO.
//
// Your instructor as a completely seperate Unit Test to test your work as
// part of the grading of the Final Project.
//

package fal18;

import org.junit.Test;
import static org.junit.Assert.*;

public class SnowboardRentalTest {
    
    public SnowboardRentalTest() {
    }

    @Test
    public void testLateCharge() {
        System.out.println("Testing lateCharge...");
        SnowboardRental instance = new SnowboardRental();
        instance.setRentalCost(125.45);
        double expResult = 25.09;
        double result = instance.lateCharge();
        assertEquals(expResult, result, 0.001);  
    }

    @Test
    public void testGetSize() {
        System.out.println("Testing getSize...");
        SnowboardRental instance = new SnowboardRental();
        int expResult = 140;
        int result = instance.getSize();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetSize() {
        System.out.println("Testing setSize...");
        int size = 150;
        SnowboardRental instance = new SnowboardRental();
        instance.setSize(size);
        int expResult = size;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsFreestyle() {
        System.out.println("Testing isFreestyle...");
        SnowboardRental instance = new SnowboardRental();
        boolean expResult = true;
        boolean result = instance.isFreestyle();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFreestyle() {
        System.out.println("Testing setFreestyle...");
        boolean freestyle = false;
        SnowboardRental instance = new SnowboardRental();
        instance.setFreestyle(freestyle);
        boolean expResult = freestyle;
        boolean result = instance.isFreestyle();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("Testing toString...");
        SnowboardRental instance = new SnowboardRental();
        String expResult = "Rental #1, Cost: $  25.00, New: false, Size:  140 cm, freestyle";
        String result = instance.toString();
        assertEquals(expResult, result);
    }    
}
