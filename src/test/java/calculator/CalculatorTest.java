package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    calculator.Calculator calculator = new calculator.Calculator();

    @Test
    void shouldAddTwoNumbers() {
        double result = calculator.add(5, 3);
        assertEquals(8.0, result);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        double result = calculator.subtract(10, 5);
        assertEquals(5.0, result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        double result = calculator.multiply(4, 5);
        assertEquals(20.0, result);
    }

    @Test
    void shouldDivideTwoNumbers() {
        double result = calculator.divide(10, 5);
        assertEquals(2.0, result);
    }
    @Test
    void shouldAddNegativeNumbers() {
        double result = calculator.add(-4, -6);
        assertEquals(-10.0, result);
    }
    @Test
    void shouldAddNumberAndZero() {
        double result = calculator.add(7, 0);
        assertEquals(7.0, result);
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}