package calculator.spring.calculator;

import calculator.spring.calculator.services.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private final CalculatorService calculator = new CalculatorService();

    @Test
    void testPlus() {
        assertEquals("3 + 5 = 8", calculator.plus(3, 5));
        assertEquals("-4 + 7 = 3", calculator.plus(-4, 7));
    }

    @Test
    void testMinus() {
        assertEquals("10 - 3 = 7", calculator.minus(10, 3));
        assertEquals("-3 - -7 = 4", calculator.minus(-3, -7));
    }

    @Test
    void testMultiply() {
        assertEquals("6 * 9 = 54", calculator.multiply(6, 9));
        assertEquals("-4 * 7 = -28", calculator.multiply(-4, 7));
    }

    @Test
    void testDivide() {
        assertEquals("10 / 2 = 5.0", calculator.divide(10, 2));
        assertEquals("9 / 3 = 3.0", calculator.divide(9, 3));
    }

    @Test
    void testDivideByZeroThrowsException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Divide by zero", exception.getMessage());
    }
}
