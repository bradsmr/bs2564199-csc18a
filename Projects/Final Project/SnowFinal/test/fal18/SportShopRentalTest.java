// This Unit Test is only for you to test/check your progress on completing
// the SportShopRental abstract class.
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

public class SportShopRentalTest {
    
    public SportShopRentalTest() {        
    }  
    
    // check NewModel getter/setter
    @Test
    public void testIsNewModel() {
        System.out.println("Testing isNewModel...");
        SportShopRental instance = new SportShopRentalImpl();
        boolean expResult = false;
        boolean result = instance.isNewModel();
        assertEquals(expResult, result);        
    }

    @Test
    public void testSetNewModel() {
        System.out.println("Testing setNewModel...");
        boolean newModel = true;
        SportShopRental instance = new SportShopRentalImpl();
        instance.setNewModel(newModel);
        boolean result = instance.isNewModel();
        assertEquals(newModel, result);
    }

    // check RentalCost getter/setter
    @Test
    public void testGetRentalCost() {
        System.out.println("Testing getRentalCost...");
        SportShopRental instance = new SportShopRentalImpl();
        double expResult = 25.0;
        double result = instance.getRentalCost();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetRentalCost() {
        System.out.println("Testing setRentalCost...");
        double rentalCost = 100.0;
        SportShopRental instance = new SportShopRentalImpl();
        instance.setRentalCost(rentalCost);
        double expResult = rentalCost;
        double result = instance.getRentalCost();
        assertEquals(expResult, result, 0.0);
    }

    // check RentalNumber getter/setter
    @Test
    public void testGetRentalNumber() {
        System.out.println("Testing getRentalNumber...");
        SportShopRental instance = new SportShopRentalImpl();
        long expResult = 1L;
        long result = instance.getRentalNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetRentalNumber() {
        System.out.println("Testing setRentalNumber...");
        long rentalNumber = 1234567890L;
        SportShopRental instance = new SportShopRentalImpl();
        instance.setRentalNumber(rentalNumber);
        long expResult = rentalNumber;
        long result = instance.getRentalNumber();
        assertEquals(expResult, result);
    }

    // check toString
    @Test
    public void testToString() {
        System.out.println("Testing toString...");
        SportShopRental instance = new SportShopRentalImpl();
        String expResult = "Rental #1, Cost: $  25.00, New: false";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    public class SportShopRentalImpl extends SportShopRental {

        public double lateCharge() {
            return 0.0;
        }
    }
    
}
