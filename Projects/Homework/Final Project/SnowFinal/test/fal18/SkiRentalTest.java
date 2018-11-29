// This Unit Test is only for you to test/check your progress on completing
// the SkiRental class.
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

public class SkiRentalTest {
    
    public SkiRentalTest() {
    }

    @Test
    public void testLateCharge() {
        System.out.println("Testing lateCharge...");
        SkiRental instance = new SkiRental();
        instance.setRentalCost(123.45);
        double expResult = 12.345;
        double result = instance.lateCharge();
        assertEquals(expResult, result, 0.0);        
    }

    @Test
    public void testToString() {
        System.out.println("Testing toString...");
        SkiRental instance = new SkiRental();
        String expResult = "Rental #1, Cost: $  25.00, New: false, Size:  175 cm";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSize() {
        System.out.println("Testing getSize...");
        SkiRental instance = new SkiRental();
        int expResult = 175;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetSize() {
        System.out.println("Testing setSize...");
        int size = 145;
        SkiRental instance = new SkiRental();
        instance.setSize(size);
        int expResult = size;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }
    
}
