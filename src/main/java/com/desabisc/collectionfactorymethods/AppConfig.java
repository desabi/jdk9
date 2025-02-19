package com.desabisc.collectionfactorymethods;

import java.util.List;

/**
 * Scenario 1: Creating a List of Configuration Properties
 * Suppose you need to define a list of configuration properties that your application reads and processes.
 * Since these configurations are fixed, you can use a factory method to create an immutable list.
 */
public class AppConfig {
    public static List<String> getSupportedFormats() {
        // Use List.of() to create an immutable list of supported formats
        return List.of("json", "xml", "csv");
    }

    public static void main(String[] args) {
        List<String> supportedFormats = getSupportedFormats();
        System.out.println("Supported formats: " + supportedFormats);

        // Attempting to modify the list will throw an UnsupportedOperationException
        // supportedFormats.add("yaml");  // This will throw an exception
    }
}
