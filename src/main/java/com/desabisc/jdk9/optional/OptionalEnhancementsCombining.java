package com.desabisc.jdk9.optional;

import java.util.Optional;

public class OptionalEnhancementsCombining {
  public static void main(String[] args) {
    Optional<String> username = Optional.of("JohnDoe"); // Username is mandatory
    Optional<String> bio = Optional.empty(); // Bio might not be provided.
    Optional<String> twitterHandle = Optional.of("john_doe_123"); // Optional social media link

    // If bio is present, display it; otherwise, show a default message
    bio.ifPresentOrElse(
        userBio -> System.out.println("userBio = " + userBio),
        () -> System.out.println("Bio: No bio provided")
    );

    // Ensure the username is always present, or throw and exception
    String user = username.orElseThrow();
    System.out.println("Username: " + user);

    // Stream the optional twitter handle if present
    twitterHandle.stream()
        .forEach(handle -> System.out.println("Twitter: @" + handle));

    // provide a fallback social media handle if none is provided
    String socialMedia = twitterHandle.or(() -> Optional.of("No social media hable")).get();
    System.out.println("socialMedia = " + socialMedia);
  }
}
