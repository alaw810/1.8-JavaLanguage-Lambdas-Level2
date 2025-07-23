package com.alaw810.ex1;

import java.util.List;

public class MainEx1 {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Ada", "Alex", "Joan", "Ari", "Leo", "Amy", "Ali");
        System.out.println(NameFilter.filterStartingWithAAndLength3(names));
    }
}
