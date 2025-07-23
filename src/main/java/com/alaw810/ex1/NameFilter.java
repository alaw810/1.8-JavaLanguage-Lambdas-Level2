package com.alaw810.ex1;

import java.util.List;

public class NameFilter {
    public static List<String> filterStartingWithAAndLength3(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .toList();
    }

}
