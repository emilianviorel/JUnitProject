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
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(6);
        Assertions.assertTrue(result);
    }

    // Test method for checking if a negative number is identified correctly
    @Test
    public void testCheckIsNegative() {
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(-6);
        Assertions.assertFalse(result);
    }

    // Parameterized test for checking if a number is identified correctly as positive
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 86, 100, Integer.MAX_VALUE})
    public void checkIsPositiveParametrized(int number) {
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(number);
        Assertions.assertTrue(result);
    }

    // Parameterized test for checking if a number is identified correctly as negative
    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3, -5, -86, -100, Integer.MIN_VALUE})
    public void checkIsNegativeParametrized(int number) {
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(number);
        Assertions.assertFalse(result);
    }
}
