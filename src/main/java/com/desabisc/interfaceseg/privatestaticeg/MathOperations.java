package com.desabisc.interfaceseg.privatestaticeg;

/**
 * source: chatgpt.
 * Consider an interface MathOperations that provides several static methods for basic arithmetic operations.
 * Some of these operations might need to use a common utility method, such as checking if an operation is safe (e.g., division by zero).
 */
public interface MathOperations {

    // Static method for addition
    static int add(int a, int b) {
        return a + b;
    }

    // Static method for subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Static method for division
    static int divide(int a, int b) {
        checkDivisionByZero(b);    // Reusing private static method
        return a / b;
    }

    // Private static method to check division by zero
    private static void checkDivisionByZero(int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}
