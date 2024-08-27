package com.desabisc.interfaceseg.privatestaticeg;

/**
 * Since the static methods of an interface can be called without creation of an implementing object,
 * these methods can only be called by public static methods defined in the interface.
 */
public interface Gender {

    private static String getPrefix(String sex) {
        return sex.equals("male") ? "Mr. " : "Ms. ";
    }

    // public static method calls a private static method
    static String getName(String name, String sex) {
        return getPrefix(sex) + name;
    }
}
