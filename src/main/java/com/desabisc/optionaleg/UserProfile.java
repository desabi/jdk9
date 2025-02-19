package com.desabisc.optionaleg;

import java.util.Optional;

/**
 * Combining Optional Enhancements in a Real-World Application
 * Scenario: User Profile Processing
 * Suppose you're building an application that processes user profiles, with some optional fields like a bio and social media links.
 * You want to handle these optional fields gracefully, provide defaults where necessary, and throw an exception if a required field like the username is missing.
 */
public class UserProfile {

    public static void main(String[] args) {
        Optional<String> username = Optional.of("JohnDoe");  // Username is mandatory
        Optional<String> bio = Optional.empty();  // Bio might not be provided
        Optional<String> twitterHandle = Optional.of("john_doe_123");  // Optional social media link

        // If bio is present, display it; otherwise, show a default message
        bio.ifPresentOrElse(
            userBio -> System.out.println("Bio: " + userBio),
            () -> System.out.println("Bio: No bio provided")
        );

        // Ensure the username is always present, or throw an exception
        String user = username.orElseThrow();
        System.out.println("Username: " + user);

        // Stream the optional twitter handle if present
        twitterHandle.stream()
            .forEach(handle -> System.out.println("Twitter: @" + handle));

        // Provide a fallback social media handle if none is provided
        String socialMedia = twitterHandle.or(() -> Optional.of("No social media handle")).get();
        System.out.println("Social Media: " + socialMedia);
    }
}
