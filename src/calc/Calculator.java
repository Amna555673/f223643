package calc;

public class Calculator {

    // Method for addition

    public int addition(int a, int b) {

        validateInputs(a, b);

        return a + b;

    }

    // Method for multiplication

    public int multiplication(int a, int b) {

        validateInputs(a, b);

        return a * b;

    }

    // Method to validate inputs

    private void validateInputs(int a, int b) {

        if (a < 0 || b < 0) {

            throw new IllegalArgumentException("Inputs must be non-negative integers.");

        }
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // Test addition

        try {

            int sum = calculator.addition(5, 10);

            System.out.println("Addition Result: " + sum);  

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }

        // Test multiplication

        try {

            int product = calculator.multiplication(4, 7);

            System.out.println("Multiplication Result: " + product); 

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }

        // Test input validation

        try {

            calculator.addition(-1, 5);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());  

        }

        try {

            calculator.multiplication(5, -3);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage()); 

        }
    }
}