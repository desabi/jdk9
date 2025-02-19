package com.desabisc.jdk9.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Java 9 introduced several static factory methods for creating immutable collections (List, Set, Map).
 * These methods are available via the List.of(), Set.of(), and Map.of() methods.
 */
public class FactoryMethods {
  public static void main(String[] args) {
    List<String> list = List.of("a", "b", "c");
    Set<String> set = Set.of("a", "b", "c");
    Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
  }
}