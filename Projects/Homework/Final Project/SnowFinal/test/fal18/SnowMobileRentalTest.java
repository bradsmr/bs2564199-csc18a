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

public class SnowMobileRentalTest {
    
    public SnowMobileRentalTest() {
    }

    @Test
    public void testLateCharge() {
        System.out.println("Testing lateCharge...");
        SnowMobileRental instance = new SnowMobileRental();
        instance.setRentalCost(500.0);
        double expResult = 125.0;
        double result = instance.lateCharge();
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testGetCapacity() {
        System.out.println("Testing getCapacity...");
        SnowMobileRental instance = new SnowMobileRental();
        int expResult = 1;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCapacity() {
        System.out.println("Testing setCapacity...");
        int capacity = 3;
        SnowMobileRental instance = new SnowMobileRental();
        instance.setCapacity(capacity);
        int expResult = capacity;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetVin() {
        System.out.println("Testing getVin...");
        SnowMobileRental instance = new SnowMobileRental();
        String expResult = "1A234567890123456789";
        String result = instance.getVin();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetVin() {
        System.out.println("Testing setVin...");
        String vin = "2B134567890123456789";
        SnowMobileRental instance = new SnowMobileRental();
        instance.setVin(vin);
        String expResult = vin;
        String result = instance.getVin();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("Testing toString...");
        SnowMobileRental instance = new SnowMobileRental();
        instance.setRentalCost(123.45);
        String expResult = "Rental #1, Cost: $ 123.45, New: false, Capacity: 1 seat, Vin: 1A234567890123456789";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
