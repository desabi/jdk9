package com.desabisc.trywithresources.before;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Source: chatgpt
 * Before Java 9, if you wanted to use a resource inside a try-with-resources block, you had to declare and initialize
 * the resource inside the try statement itself.
 * If the resource was already initialized earlier, you would need to either reinitialize it or use an extra block
 * to handle the resource.
 * This could lead to more verbose code.
 */
public class PreJava9Example {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        try (BufferedReader br = reader) {  // Re-declaration is required here
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
