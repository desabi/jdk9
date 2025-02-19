package com.desabisc.collectionfactorymethods;

import java.util.Map;

/**
 * cenario 3: Creating a Map of Configuration Key-Value Pairs
 * You might need a map of configuration key-value pairs in an application, where each key has an associated value.
 * These configuration pairs are fixed, so an immutable map is appropriate.
 */
public class ConfigSettings {

    public static Map<String, String> getDefaultSettings() {
        // Use Map.of() to create an immutable map of configuration key-value pairs
        return Map.of(
            "theme", "dark",
            "timeout", "30s",
            "language", "en"
        );
    }

    public static void main(String[] args) {
        Map<String, String> settings = getDefaultSettings();
        System.out.println("Default settings: " + settings);

        // Attempting to modify the map will throw an UnsupportedOperationException
        // settings.put("timezone", "UTC");  // This will throw an exception
    }
}
