package com.desabisc.improvedstrem;

import java.util.stream.Stream;

/**
 * 4. iterate() Overload Real-World Example
 * Scenario: Generating a Sequence of Even Numbers with a Stop Condition
 * The enhanced iterate() method allows you to create an infinite stream with a stopping condition.
 */
public class Iterate {

    public static void main(String[] args) {
        // Generate even numbers less than 20 using the enhanced iterate()
        Stream.iterate(0, n -> n < 20, n -> n + 2)
            .forEach(System.out::println);

        /*
        The overloaded iterate() method now takes a condition (n < 20) that stops the iteration when the condition is false.
        This simplifies the generation of finite sequences.
        This example generates even numbers starting from 0 and stops when the number reaches 20.
         */
    }
}
