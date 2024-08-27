package com.desabisc.interfaceseg.privatestaticeg;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrivateStaticMethodA {
    public static void main(String[] args) {
        // public static method calls a private static method
        log.info("{}", Gender.getName("Jada", "female"));
        log.info("{}", Gender.getName("Smith", "male"));
    }
}
