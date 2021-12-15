package com.rodrigot.projects;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    // An ordered collection aka sequence
    // Allow duplicates
    // Not Fixed in size like arrays
    // Fast for data retrivals
    // Various implementations
        // ArrayList
        // Stack
        // Vector
        // Others

    public static void main(String[] args) {
        List<String> colorsUnmodifiable = List.of(
                "Blue",
                "Yellow"
        );

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Yellow");
        System.out.println(colors.size());
        System.out.println(colors.contains("Yellow"));
        System.out.println(colors.contains("Pink"));
        System.out.println(colors);

        for (String color: colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);
    }
}
