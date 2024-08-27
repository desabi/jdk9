package com.desabisc.interfaceseg.privateeg;

import java.util.Random;

/**
 * Private methods are useful to call from default methods.
 */
public interface RandomGenerator {
    private int getNumber() {
        return (new Random()).nextInt(100);
    }

    default void printRandomNumber(String text) {
        System.out.println(text + " " + getNumber());
    }
}
