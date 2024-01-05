import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterMeasureUnitsTest {
    public static final double DELTA = 0.01;
    private static ConverterMeasureUnits converterMeasureUnits;

    // Constants for test cases
    private static final int TEMPERATURE_IN_FAHRENHEIT = 70;
    private static final double MILES_TO_KILOMETERS_INPUT = 10.5;
    private static final double POUNDS_TO_KILOGRAMS_INPUT = 10;
    private static final double GALLONS_TO_LITERS_INPUT = 10;

    // Expected results for test cases
    private static final double FAHRENHEIT_TO_CELSIUS_EXPECTED = 21.11;
    private static final double MILES_TO_KILOMETERS_EXPECTED = 16.89;
    private static final double POUNDS_TO_KILOGRAMS_EXPECTED = 4.53;
    private static final double GALLONS_TO_LITERS_EXPECTED = 37.85;

    @BeforeAll
    public static void setUp() {
        converterMeasureUnits = new ConverterMeasureUnits();
        System.out.println("BeforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Executing BeforeEach method");
    }

    @Test
    void testFahrenheitToCelsiusConversion() {
        assertEquals(FAHRENHEIT_TO_CELSIUS_EXPECTED,
                converterMeasureUnits.fahrenheitToCelsius(TEMPERATURE_IN_FAHRENHEIT), DELTA);
    }

    @Test
    void testMilesToKilometersConversion() {
        var kilometers = converterMeasureUnits.milesToKilometers(MILES_TO_KILOMETERS_INPUT);
        assertEquals(MILES_TO_KILOMETERS_EXPECTED, kilometers, DELTA);
    }

    @Test
    void testPoundsToKilogramsConversion() {
        double kilograms = converterMeasureUnits.poundsToKilograms(POUNDS_TO_KILOGRAMS_INPUT);
        assertEquals(POUNDS_TO_KILOGRAMS_EXPECTED, kilograms, DELTA);
    }

    @Test
    void testGallonsToLitersConversion() {
        double liters = converterMeasureUnits.gallonsToLiters(GALLONS_TO_LITERS_INPUT);
        assertEquals(GALLONS_TO_LITERS_EXPECTED, liters, DELTA);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Executing AfterEach method");
    }
}
