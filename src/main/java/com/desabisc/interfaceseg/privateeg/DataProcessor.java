package com.desabisc.interfaceseg.privateeg;

/**
 * source: chatgpt
 * Imagine you have an interface DataProcessor that provides default methods for processing data in different formats (e.g., JSON and XML).
 * The processing logic for each format might share some common steps, such as validating the data.
 */
public interface DataProcessor {

    // Default method to process JSON data
    default void processJson(String jsonData) {
        validate(jsonData);       // Reusing private method
        // Specific processing logic for JSON
        System.out.println("Processing JSON data: " + jsonData);
    }

    // Default method to process XML data
    default void processXml(String xmlData) {
        validate(xmlData);        // Reusing private method
        // Specific processing logic for XML
        System.out.println("Processing XML data: " + xmlData);
    }

    // Private method to validate the data
    private void validate(String data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Invalid data");
        }
        // Additional validation logic
        System.out.println("Data is valid.");
    }
}
