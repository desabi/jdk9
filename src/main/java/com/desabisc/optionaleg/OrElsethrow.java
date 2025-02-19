package com.desabisc.optionaleg;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * 4. orElseThrow() (No Arguments) Real-World Example: ConfigLoader
 * Scenario: Throwing an Exception if a Required Value is Missing
 * In certain cases, you may want to throw an exception if a required value is missing.
 * For example, if you are retrieving an essential configuration setting that must be present, you can use orElseThrow() to throw an exception when it’s absent.
 */
public class OrElsethrow {

    public static void main(String[] args) {
        Optional<String> apiKey = Optional.empty();  // Simulating a missing API key

        try {
            // If the API key is not present, throw NoSuchElementException
            String key = apiKey.orElseThrow();
            System.out.println("API Key: " + key);
        } catch (NoSuchElementException e) {
            System.err.println("API Key is missing: " + e.getMessage());
        }
    }

    /*
    orElseThrow() throws a NoSuchElementException if the Optional is empty.
    This is useful when you want to enforce that a value must be present and handle the case where it’s not, typically by throwing an exception.
     */
}
