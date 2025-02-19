package com.desabisc.jdk9.optional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Java 9 introduced new methods to the Optional class:
 * - ifPresentOrElse: Executes a Runnable if a value is present, or another Runnable if not.
 * - or: Returns an Optional describing the value or an alternative Optional if empty.
 * - stream: Converts an Optional into a Stream.
 */
public class OptionalEnhancements {
  public static void main(String[] args) {
    ifPresentOrElseEg();
    orEg();
    streamEg();
    orElseThrowEg();
  }

  /**
   * Scenario: Handling User Data
   * Imagine you’re processing user data, and you want to perform one action if the user is
   * logged in (value is present) and a different action if the user is not logged in (value is absent).
   * This method is useful in scenarios where you want to handle both the present
   * and absent cases in a clean and readable manner.
   */
  static void ifPresentOrElseEg() {
    Optional<String> loggedInUser = Optional.of("JohnDoe");  // Simulating a logged-in user
    Optional<String> guestUser = Optional.empty();  // Simulating a guest user (not logged in)

    // ifPresentOrElse() allows you to either welcome the logged-in user (if the value is present)
    // or prompt the user to log in (if the value is absent).

    // Process logged-in user
    loggedInUser.ifPresentOrElse(
        user -> System.out.println("Welcome back, " + user + "!"),
        () -> System.out.println("Please log in.")
    );

    // Process guest user
    guestUser.ifPresentOrElse(
        user -> System.out.println("Welcome back, " + user + "!"),
        () -> System.out.println("Please log in.")
    );
  }

  /**
   * Scenario: Providing a Default Value
   * You might have a scenario where you need a fallback value if the current Optional is empty.
   * For example, when fetching a user’s preferred language, you might return an alternative Optional
   * if no preference is set.
   */
  static void orEg() {
    Optional<String> preferredLanguage = Optional.empty();  // Simulating no preferred language

    // If no preferred language, return the default language ("English")
    String language = preferredLanguage
        .or(() -> Optional.of("English"))
        .get();

    System.out.println("Language: " + language);
  }

  /**
   * Scenario: Integrating Optionals with Streams
   * In some scenarios, you may want to combine Optional values with the Stream API. The stream() method
   * converts an Optional into a Stream, which can be particularly useful when working with streams of data.
   */
  static void streamEg() {
    Optional<String> specialOffer = Optional.of("50% off on Laptops");  // Special offer available
    Optional<String> noOffer = Optional.empty();  // No offer available

    // The stream() method converts the Optional into a Stream. If the Optional is present,
    // it becomes a single-element stream; if it's empty, it becomes an empty stream.
    //The flatMap(Optional::stream) operation allows you to filter out the absent values and only
    // collect the present values from a list of Optionals.
    List<String> offers = List.of(specialOffer, noOffer).stream()
        .flatMap(Optional::stream)
        .toList();

    System.out.println("Available offers: " + offers);
  }

  /**
   * Scenario: Throwing an Exception if a Required Value is Missing
   * In certain cases, you may want to throw an exception if a required value is missing.
   * For example, if you are retrieving an essential configuration setting that must be present,
   * you can use orElseThrow() to throw an exception when it’s absent.
   */
  static void orElseThrowEg() {
    Optional<String> apiKey = Optional.empty(); // Simulating a missing API key.

    try {
      String key = apiKey.orElseThrow();
      System.out.println("API Key = " + apiKey);
    } catch (NoSuchElementException e) {
      System.err.println("API key is missing = " + e);
    }
  }
}
