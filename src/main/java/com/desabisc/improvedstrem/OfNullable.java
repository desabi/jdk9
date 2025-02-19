package com.desabisc.improvedstrem;

import java.util.stream.Stream;

/**
 * 3. ofNullable() Real-World Example
 * Scenario: Safely Processing Optional User Data
 * In some cases, you may be processing data that could be null.
 * For instance, if you are working with user-provided input, you can use ofNullable() to avoid NullPointerException
 * when processing the data.
 */
public class OfNullable {

    public static void main(String[] args) {
        String userComment = null;  // Assume this comes from user input

        // Process the comment only if it's not null using ofNullable
        Stream.ofNullable(userComment)
            .forEach(comment -> System.out.println("Processing comment: " + comment));

        // Example with a non-null comment
        String anotherComment = "Great job!";
        Stream.ofNullable(anotherComment)
            .forEach(comment -> System.out.println("Processing comment: " + comment));
        /*
        Stream.ofNullable(userComment) creates an empty stream if the userComment is null.
        This allows safe processing of potential null values.
        In the example, the first comment is null, so it doesn't get processed.
        The second comment is not null, so it's printed.
         */
    }
}
