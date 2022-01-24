public class Calculator {

    // Initializing Fields
    private double result;

    // Constructors
    public Calculator() {

        double result = 0;

    }

    // Getters
    public double getResult() {

        return result;

    }

    // Calculations
    public void add(double firstValue, double secondValue) {

        result = firstValue + secondValue;

    }

    public void subtract(double subtractingValue, double subtractedValue) {

        result = subtractingValue - subtractedValue;

    }

    public void multiply(double firstValue, double secondValue) {

        result = firstValue * secondValue;

    }

    public void square(double value) {

        result = value * value;

    }

    // Clear
    public void clear() {

        result = 0;

    }

}
