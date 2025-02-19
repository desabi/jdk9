package com.desabisc.optionaleg;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 3. stream() Real-World Example: ProductCatalog
 * Scenario: Integrating Optionals with Streams
 * In some scenarios, you may want to combine Optional values with the Stream API.
 * The stream() method converts an Optional into a Stream, which can be particularly useful when working with streams of data.
 */
public class StreamEg {

    public static void main(String[] args) {
        Optional<String> specialOffer = Optional.of("50% off on Laptops");  // Special offer available
        Optional<String> noOffer = Optional.empty();  // No offer available

        List<String> offers = List.of(specialOffer, noOffer).stream()
            .flatMap(Optional::stream) // here
            .collect(Collectors.toList());

        System.out.println("Available offers: " + offers);
    }

    /**
     * The stream() method converts the Optional into a Stream. If the Optional is present, it becomes a single-element stream; if it's empty, it becomes an empty stream.
     * The flatMap(Optional::stream) operation allows you to filter out the absent values and only collect the present values from a list of Optionals.
     */
}
