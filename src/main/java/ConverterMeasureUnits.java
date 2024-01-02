public class ConverterMeasureUnits {

    public static final double CELSIUS_FACTOR = 5.0 / 9.0;
    public static final double FAHRENHEIT_BASE = 32.0;
    public static final double MILE = 1.60934;
    public static final double POUND = 0.453592;
    public static final double GALLON = 3.78541;

    public double fahrenheitToCelsius(double temperatureInFahrenheit) {
        double result = CELSIUS_FACTOR * (temperatureInFahrenheit - FAHRENHEIT_BASE);
        return Double.parseDouble(String.format("%.2f", result));
    }

    public double milesToKilometers(double distanceInMiles) {
        double result = distanceInMiles * MILE;
        return Double.parseDouble(String.format("%.2f", result));
    }

    public double poundsToKilograms(double weightInPounds) {
        double result = weightInPounds * POUND;
        return Double.parseDouble(String.format("%.2f", result));
    }

    public double gallonsToLiters(double volumeInGallon) {
        double result = volumeInGallon * GALLON;
        return Double.parseDouble(String.format("%.2f", result));
    }
}
