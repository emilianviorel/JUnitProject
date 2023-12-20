import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void beforeAllMethod() {
        // Initialize the Calculator before all test methods
        calculator = new Calculator();
        System.out.println("BeforeAll");
    }

    @Test
    public void addTest() {
        // Test the addition functionality of the Calculator
        int result = calculator.add(2, 3);
        Assertions.assertEquals(result, 5);
    }

    @Test
    public void diffTest() {
        // Test the subtraction functionality of the Calculator
        int result = calculator.diff(10, 5);
        Assertions.assertEquals(result, 5);
    }

    @Test
    public void multiplyTest() {
        // Test the multiplication functionality of the Calculator
        int result = calculator.multiply(10, 5);
        Assertions.assertEquals(result, 50);
    }

    @Test
    public void divideTest() {
        // Test the division functionality of the Calculator
        double result = calculator.divide(11, 5);
        Assertions.assertEquals(result, 2.2);
    }

    @AfterAll
    public static void afterAllMethod() {
        // Clean up or perform actions after all test methods have executed
        System.out.println("AfterAll");
    }
}
