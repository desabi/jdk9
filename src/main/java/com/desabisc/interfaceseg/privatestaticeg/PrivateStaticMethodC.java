package com.desabisc.interfaceseg.privatestaticeg;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrivateStaticMethodC {
    public static void main(String[] args) {
        int sum = MathOperations.add(10, 5);
        int difference = MathOperations.subtract(10, 5);
        int quotient = MathOperations.divide(10, 2);

        log.info("Sum: {} ", sum);
        log.info("Difference: {}", difference);
        log.info("Quotient: {}", quotient);

        // This will throw an exception
        // int error = MathOperations.divide(10, 0);
    }
}
