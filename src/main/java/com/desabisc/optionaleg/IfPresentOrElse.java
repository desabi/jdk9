package com.desabisc.optionaleg;

import java.util.Optional;

/**
 * 1. ifPresentOrElse() Real-World Example: UserLoginProcessor
 * Scenario: Handling User Data
 * Imagine you’re processing user data, and you want to perform one action if the user is logged in (value is present)
 * and a different action if the user is not logged in (value is absent).
 */
public class IfPresentOrElse {

    public static void main(String[] args) {
        Optional<String> loggedInUser = Optional.of("JohnDoe");  // Simulating a logged-in user
        Optional<String> guestUser = Optional.empty();  // Simulating a guest user (not logged in)

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

    /*
    ifPresentOrElse() allows you to either welcome the logged-in user (if the value is present) or prompt the user to log in (if the value is absent).
    This method is useful in scenarios where you want to handle both the present and absent cases in a clean and readable manner.
     */
}
