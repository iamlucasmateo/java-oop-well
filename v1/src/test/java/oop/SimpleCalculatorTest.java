package v1.src.test.java.oop;

import org.junit.Test;
import static org.junit.Assert.*;

import v1.src.main.java.oop.SimpleCalculator;


public class SimpleCalculatorTest {
    @Test
    public void twoPlusTwoIsFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add(2, 2);
        assertNotNull(result);
        assertEquals(4, result);
        
        boolean statement1 = calculator.add(3, 2) == 5;
        assertTrue(statement1);

        boolean statement2 = calculator.add(3, 3) == 5;
        assertFalse(statement2);
    }
}
