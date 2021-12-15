package com.rodrigot.projects;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSet {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("blue");
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        System.out.println(colors.size());
        colors.forEach(System.out::println);
    }
}
