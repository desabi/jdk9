package com.desabisc.trywithresources.after;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * In Java 9, the try-with-resources statement allows you to use an already initialized resource without re-declaring it
 * inside the try block, provided that the resource is effectively final (i.e., not reassigned after initialization).
 */
@Slf4j
public class Java9Example {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        try (reader) {  // No re-declaration, just reference the existing resource
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            log.error("Exception: {}", exception.getMessage());
        }
    }
}
