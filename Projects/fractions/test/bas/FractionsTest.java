package bas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rcc
 */
public class FractionsTest {
    
    public FractionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetNumerator() {
        System.out.println("getNumerator");
        Fractions instance = new Fractions();
        int expResult = 0;
        int result = instance.getNumerator();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNumerator() {
        System.out.println("setNumerator");
        int numerator = 0;
        Fractions instance = new Fractions();
        instance.setNumerator(numerator);
    }

    @Test
    public void testGetDenominator() {
        System.out.println("getDenominator");
        Fractions instance = new Fractions();
        int expResult = 1;
        int result = instance.getDenominator();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDenominator() {
        System.out.println("setDenominator");
        int denominator = 1;
        Fractions instance = new Fractions();
        instance.setDenominator(denominator);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Fractions instance = new Fractions();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Fractions op2 = new Fractions(3,9);
        Fractions instance = new Fractions(9,12);
        Fractions expResult = new Fractions(13,12);
        Fractions result = instance.add(op2);
        assertEquals(expResult.getNumerator(), result.getNumerator());
        assertEquals(expResult.getDenominator(), result.getDenominator());
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Fractions.main(args);
    }
    
}
