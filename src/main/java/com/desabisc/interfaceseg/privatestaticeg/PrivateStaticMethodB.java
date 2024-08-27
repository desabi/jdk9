package com.desabisc.interfaceseg.privatestaticeg;

/**
 * <a href="https://www.baeldung.com/new-java-9">Source</a>
 */
interface PrivateStaticMethodB {

    /**
     *  Interfaces in the upcoming JVM version can have private methods,
     *  which can be used to split lengthy default methods:
     */

    private static String staticPrivate() {
        return "static private";
    }
    
    private String instancePrivate() {
        return "instance private";
    }

    // default method calls static private method
    // default method calls private method
    default void check() {
        String result = staticPrivate();
        PrivateStaticMethodB psm = new PrivateStaticMethodB() {
            // anonymous class
        };
        result = psm.instancePrivate();
    }
}