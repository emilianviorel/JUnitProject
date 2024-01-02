import org.junit.jupiter.api.*;

class ConverterMeasureUnitsTest {
    public static final double DELTA = 0.01;
    private static ConverterMeasureUnits converterMeasureUnits;

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
        double celsius = converterMeasureUnits.fahrenheitToCelsius(70);
        Assertions.assertEquals(21.11, celsius, DELTA);
    }

    @Test
    void testMilesToKilometersConversion() {
        double kilometers = converterMeasureUnits.milesToKilometers(10.5);
        Assertions.assertEquals(16.89, kilometers, DELTA);
    }

    @Test
    void testPoundsToKilogramsConversion() {
        double kilograms = converterMeasureUnits.poundsToKilograms(10);
        Assertions.assertEquals(4.53, kilograms, DELTA);
    }

    @Test
    void testGallonsToLitersConversion() {
        double liters = converterMeasureUnits.gallonsToLiters(10);
        Assertions.assertEquals(37.85, liters, DELTA);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Executing AfterEach method");
    }
}
