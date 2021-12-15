package com.rodrigot.projects;

import java.util.Arrays;

public class WorkingWithArrays {

    // Fixed in size
    // Fast for data retrivals -> O(n)
    // Compact memory usage if size is known
    // Delete operation is very hard
    // 2D Arrays

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "Yellow";

        System.out.println(colors[2]);

        int[] numbers = {100, 200};

        for (int i = 0; i < colors.length ; i++) {
            System.out.println(colors[i]);
        }

        for (int i = colors.length - 1; i >=0 ; i--) {
            System.out.println(colors[i]);
        }

        System.out.println(colors.length);

        for (String color: colors) {
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);

        // Arrays have a lot of pre implemented methods
    }
}
