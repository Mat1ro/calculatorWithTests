package calculator.spring.calculator;

import calculator.spring.calculator.services.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParameterizedTest {
    private final CalculatorService calculator = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "3, 5, 3 + 5 = 8",
            "-4, 7, -4 + 7 = 3"
    })
    void testPlus(int a, int b, String expected) {
        assertEquals(expected, calculator.plus(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 3, 10 - 3 = 7",
            "-3, -7, -3 - -7 = 4"
    })
    void testMinus(int a, int b, String expected) {
        assertEquals(expected, calculator.minus(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "6, 9, 6 * 9 = 54",
            "-4, 7, -4 * 7 = -28"
    })
    void testMultiply(int a, int b, String expected) {
        assertEquals(expected, calculator.multiply(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 10 / 2 = 5.0",
            "9, 3, 9 / 3 = 3.0"
    })
    void testDivide(int a, int b, String expected) {
        assertEquals(expected, calculator.divide(a, b));
    }
}