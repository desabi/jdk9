package com.desabisc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    /**
     * Interfaces New Features
     * - Default methods (JDK8)
     * - Static Methods (JDK8)
     * - Private Methods (JDK9)
     * - Private Static Methods (JDK9)
     */
    public static void main(String[] args) {
        log.info("Hello world!");
    }

    /*
     * source: chatgpt
     * - Private methods are used to share common code between multiple default methods within an interface.
     * - Private static methods are used to share utility logic among static methods in an interface.
     * - These private methods help in keeping the code clean, DRY (Don't Repeat Yourself), and maintainable by encapsulating shared logic that doesn't need to be exposed to the interface implementers.
     */
}