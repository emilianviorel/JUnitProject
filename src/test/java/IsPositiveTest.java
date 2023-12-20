// Import necessary JUnit classes for testing

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// Test class for the IsPositive class
public class IsPositiveTest {

    // Test method for checking if a positive number is identified correctly
    @Test
    public void testCheckIsPositive() {
        // Create an instance of the IsPositive class
        IsPositive isPositive = new IsPositive();

        // Call the checkIsPositive method with a positive number (6 in this case)
        boolean result = isPositive.checkIsPositive(6);

        // Assert that the result is true, indicating that the number is positive
        Assertions.assertTrue(result);
    }

    // Test method for checking if a negative number is identified correctly
    @Test
    public void testCheckIsNegative() {
        // Create an instance of the IsPositive class
        IsPositive isPositive = new IsPositive();

        // Call the checkIsPositive method with a negative number (-6 in this case)
        boolean result = isPositive.checkIsPositive(-6);

        // Assert that the result is false, indicating that the number is not positive (negative)
        Assertions.assertFalse(result);

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 86, 100, Integer.MAX_VALUE})
    public void checkIsPositiveParametrized(int number) {
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(number);
        Assertions.assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3, -5, -86, -100, Integer.MIN_VALUE})
    public void checkIsNegativeParametrized(int number) {
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(number);
        Assertions.assertFalse(result);

    }


}
