package v1.src.test.ch5_tdd;
import v1.src.main.java.oop.ch5_tdd.BillCalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class BillCalculatorTest {
    @Test
    public void totalStartsAtZero() {
        var calculator = new BillCalculator();
        float total = calculator.getTotal();
        assertEquals(0, total, 0.001);
    }

    @Test
    public void totalIsSumOfAllItems() {
        var calculator = new BillCalculator();
        calculator.addItem((float)10);
        calculator.addItem((float)20);
        float total = calculator.getTotal();
        assertEquals(30, total, 0.001);
    }
}
