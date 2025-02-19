package com.desabisc.jdk9.interfaceseg.privateeg;

/**
 * Java 9 allows private methods in interfaces, enabling code sharing between default and static methods.
 * Improves code reuse within interfaces.
 * Helps avoid code duplication and enhances maintainability.
 */
public class PrivateMethodA {
    public static void main(String[] args) {
        RandomGeneratorImpl randomGenerator = new RandomGeneratorImpl();
        randomGenerator.printRandomNumber("Hello");
    }
}
