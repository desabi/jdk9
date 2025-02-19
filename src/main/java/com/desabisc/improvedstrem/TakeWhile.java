package com.desabisc.improvedstrem;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. takeWhile() Real-World Example
 * Scenario: Processing User Transactions
 * Suppose you are processing a list of user transactions and want to process only those transactions that are below a
 * certain amount, stopping when you encounter a transaction that exceeds this threshold.
 */
public class TakeWhile {

    public static void main(String[] args) {
        List<Integer> transactions = List.of(50, 100, 150, 300, 400, 500);

        // Process only transactions below 300 using takeWhile
        List<Integer> validTransactions = transactions.stream()
            .takeWhile(amount -> amount < 300)
            .collect(Collectors.toList());

        System.out.println("Valid transactions: " + validTransactions);
        /*
        The takeWhile() method processes elements as long as the condition (amount < 300) is true and stops at the first element that doesn't match the predicate.
        In this case, transactions stop being processed once the amount reaches 300, so only the transactions 50, 100, and 150 are included in the result.
         */
    }
}
