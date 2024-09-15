package com.desabisc.improvedstrem;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Combining Stream Enhancements in a Real-World Application
 * Scenario: Processing a Product Catalog
 * Imagine you have a product catalog where you want to filter out discontinued products, process active ones,
 * and ensure you handle nullable fields gracefully.
 */
public class ProductCatalog {

    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", 1000, true),
            new Product("Tablet", 600, false),
            new Product("Smartphone", 800, true),
            new Product("Monitor", 300, true)
        );

        // Process products using takeWhile (discontinued products come last)
        List<Product> activeProducts = products.stream()
            .takeWhile(Product::isActive)
            .collect(Collectors.toList());

        // TODO: only prints one element
        System.out.println("Active products: " + activeProducts);

        // Handle a potential null description using ofNullable
        Product product = new Product("Printer", 200, true);
        Stream.ofNullable(product.getDescription())
            .forEach(description -> System.out.println("Description: " + description));
    }
}

