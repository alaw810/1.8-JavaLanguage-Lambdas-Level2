package com.alaw810.ex4;

import java.util.List;

public class MainEx4 {
    public static void main(String[] args) {
        List<Object> list = List.of(
                "Leo", "Amy", 66, "Adria", 35, 42, "echo",
                3.14, "e44", "Beta", "123", 789
        );

        System.out.println("Sorted by first character:");
        ListProcessor.sortByFirstCharacter(list).forEach(System.out::println);

        System.out.println("\nStrings with 'e' first:");
        ListProcessor.prioritizeStringsWithE(list).forEach(System.out::println);

        System.out.println("\nReplacing 'a' with '4':");
        ListProcessor.replaceAWithFour(list).forEach(System.out::println);

        System.out.println("\nOnly numeric strings:");
        ListProcessor.filterNumericElements(list).forEach(System.out::println);
    }
}
