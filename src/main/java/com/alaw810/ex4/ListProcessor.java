package com.alaw810.ex4;

import java.util.List;
import java.util.stream.Collectors;

public class ListProcessor {

    // Sort alphabetically by first character
    public static List<String> sortByFirstCharacter(List<Object> items) {
        return items.stream()
                .map(Object::toString)
                .sorted((s1, s2) -> Character.compare(s1.charAt(0), s2.charAt(0)))
                .collect(Collectors.toList());
    }

    // Strings beginning with 'e' first, then the rest
    public static List<String> prioritizeStringsWithE(List<Object> items) {
        return items.stream()
                .map(Object::toString)
                .sorted((s1, s2) -> {
                    boolean s1HasE = s1.contains("e");
                    boolean s2HasE = s2.contains("e");
                    if (s1HasE && !s2HasE) return -1;
                    if (!s1HasE && s2HasE) return 1;
                    return 0;
                })
                .collect(Collectors.toList());
    }

    // Replace 'a' with '4'
    public static List<String> replaceAWithFour(List<Object> items) {
        return items.stream()
                .map(Object::toString)
                .map(s -> s.replace("a", "4"))
                .collect(Collectors.toList());
    }

    // Only show numeric values
    public static List<String> filterNumericElements(List<Object> items) {
        return items.stream()
                .map(Object::toString)
                .filter(s -> s.matches("\\d+(\\.\\d+)?"))
                .collect(Collectors.toList());
    }
}
