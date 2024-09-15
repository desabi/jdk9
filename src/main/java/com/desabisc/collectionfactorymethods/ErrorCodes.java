package com.desabisc.collectionfactorymethods;

import java.util.Set;

/**
 * Scenario 2: Creating a Set of Unique Error Codes
 * In a real-world application, you might have a fixed set of error codes that you use across the application.
 * These codes are unique, so using a Set is appropriate.
 */
public class ErrorCodes {

    public static Set<Integer> getErrorCodes() {
        // Use Set.of() to create an immutable set of error codes
        return Set.of(1001, 1002, 1003, 1004);
    }

    public static void main(String[] args) {
        Set<Integer> errorCodes = getErrorCodes();
        System.out.println("Error codes: " + errorCodes);

        // Attempting to modify the set will throw an UnsupportedOperationException
        // errorCodes.add(1005);  // This will throw an exception
    }
}
