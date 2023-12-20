public class Calculator {

    /**
     * Adds two integers.
     *
     * @param x The first integer.
     * @param y The second integer.
     * @return The sum of x and y.
     */
    public int add(int x, int y) {
        return x + y;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param x The minuend.
     * @param y The subtrahend.
     * @return The difference of x and y.
     */
    public int diff(int x, int y) {
        return x - y;
    }

    /**
     * Multiplies two integers.
     *
     * @param x The first integer.
     * @param y The second integer.
     * @return The product of x and y.
     */
    public int multiply(int x, int y) {
        return x * y;
    }

    /**
     * Divides one integer by another, returning a double result.
     *
     * @param x The dividend.
     * @param y The divisor.
     * @return The result of dividing x by y as a double.
     */
    public double divide(int x, int y) {
        // Using (double) casting to ensure a double result
        return (double) x / y;
    }
}
