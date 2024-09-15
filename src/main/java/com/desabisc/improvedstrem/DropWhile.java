package com.desabisc.improvedstrem;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. dropWhile() Real-World Example
 * Scenario: Filtering Sorted Transactions
 * In a similar scenario, if the transactions are sorted, you might want to skip the lower-value transactions and
 * start processing once a threshold is reached.
 */
public class DropWhile {

    public static void main(String[] args) {
        List<Integer> transactions = List.of(50, 100, 150, 300, 400, 500);

        // Skip transactions below 300 using dropWhile
        List<Integer> largeTransactions = transactions.stream()
            .dropWhile(amount -> amount < 300)
            .collect(Collectors.toList());

        System.out.println("Large transactions: " + largeTransactions);
        /*
        The dropWhile() method skips elements while the condition is true and starts processing once the first element fails the predicate.
        In this case, transactions below 300 are skipped, and processing starts from the 300 transaction.
         */
    }
}
