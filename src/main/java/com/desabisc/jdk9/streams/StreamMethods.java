package com.desabisc.jdk9.streams;

import java.util.List;
import java.util.stream.Stream;

/**
 * The Stream API introduced in Java 8 was enhanced in Java 9 with additional methods, such as:
 * - takeWhile: Takes elements while a condition is true.
 * - dropWhile: Drops elements while a condition is true.
 * - ofNullable: Creates a single-element stream if the value is non-null, or an empty stream if null.
 * - iterate: An overloaded version that allows a predicate to terminate the iteration.
 */
public class StreamMethods {
  public static void main(String[] args) {
    takeWhileEg();
    dropWhileEg();
    ofNullableEg();
    iterateEg();
  }

  /**
   * Scenario: Processing User Transactions
   * Suppose you are processing a list of user transactions and want to process only those
   * transactions that are below a certain amount, stopping when you encounter a transaction
   * that exceeds this threshold.
   */
  static void takeWhileEg() {
    List<Integer> transactions = List.of(50, 100, 150, 300, 400, 500);

    // Process only transactions below 300 using takeWhile
    List<Integer> validTransactions = transactions.stream()
        .takeWhile(amount -> amount < 300)
        .toList();

    System.out.println("Valid transactions: " + validTransactions);
  }

  /**
   * Scenario: Filtering Sorted Transactions
   * In a similar scenario, if the transactions are sorted, you might want to skip the lower-value
   * transactions and start processing once a threshold is reached.
   */
  static void dropWhileEg() {
    List<Integer> transactions = List.of(50, 100, 150, 300, 400, 500);

    // Skip transactions below 300 using dropWhile
    // The dropWhile() method skips elements while the condition is true and starts processing once
    // the first element fails the predicate.
    List<Integer> largeTransactions = transactions.stream()
        .dropWhile(amount -> amount < 300)
        .toList();

    System.out.println("Large transactions: " + largeTransactions);
  }

  /**
   * Scenario: Safely Processing Optional User Data
   * In some cases, you may be processing data that could be null. For instance, if you are working
   * with user-provided input, you can use ofNullable() to avoid NullPointerException when
   * processing the data.
   */
  static void ofNullableEg() {
    // Example with a non-null comment
    String anotherComment = "Great job!";
    Stream.ofNullable(anotherComment)
        .forEach(comment -> System.out.println("Processing comment: " + comment));


    // Stream.ofNullable(userComment) creates an empty stream if the userComment is null.
    // This allows safe processing of potential null values.
    String userComment = null;  // Assume this comes from user input
    // Process the comment only if it's not null using ofNullable
    Stream.ofNullable(userComment)
        .forEach(comment -> System.out.println("Processing comment: " + comment));
  }

  /**
   * Scenario: Generating a Sequence of Even Numbers with a Stop Condition
   * The enhanced iterate() method allows you to create an infinite stream with a stopping condition.
   */
  static void iterateEg() {
    // Generate even numbers less than 20 using the enhanced iterate()
    Stream.iterate(0, n -> n < 20, n -> n + 2)
        .forEach(System.out::println);
  }
}
