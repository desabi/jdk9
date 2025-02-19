package com.desabisc.optionaleg;

import java.util.Optional;

/**
 * 2. or() Real-World Example: LanguagePreference
 * Scenario: Providing a Default Value
 * You might have a scenario where you need a fallback value if the current Optional is empty.
 * For example, when fetching a user’s preferred language, you might return an alternative Optional if no preference is set.
 */
public class OrEg {

    public static void main(String[] args) {
        Optional<String> preferredLanguage = Optional.of("Spanish");
        Optional<String> preferredLanguageEmpty = Optional.empty();  // Simulating no preferred language

        String selectedLanguage = preferredLanguage.or(() -> Optional.of("English")).get();

        // If no preferred language, return the default language ("English")
        String defaultLanguage = preferredLanguageEmpty
            .or(() -> Optional.of("English"))
            .get();

        System.out.println("selectedLanguage: " + selectedLanguage);
        System.out.println("defaultLanguage: " + defaultLanguage);
    }
}
