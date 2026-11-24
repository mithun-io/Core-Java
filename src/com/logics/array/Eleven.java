package com.logics.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Eleven {
    static int[] one = {1, 3, 5, 7, 9, 2, 4, 6, 8};
    static int[] two = {2, 4, 6, 8, 1, 3, 5, 7, 9};

    // Write a program to perform Union of Two Arrays.
    static void union() {
        Set<Integer> s = new HashSet<>();
        for (int num : one) {
            s.add(num);
        }
        for (int num : two) {
            s.add(num);
        }
        System.out.println(s);
    }

    // Write a program to perform intersection of Two Arrays.
    static void intersection() {
        Set<Integer> s = new LinkedHashSet<>();
        for (int num : one) {
            s.add(num);
        }
        Set<Integer> result = new LinkedHashSet<>();
        for (int num : two) {
            if (s.contains(num)) {
                result.add(num);
            }
        }
        System.out.println(result);
    }

    static void main(String[] args) {
        union();
        intersection();
    }
}

/*
Output:
[1, 2, 3, 4, 5, 6, 7, 8, 9]
[2, 4, 6, 8, 1, 3, 5, 7, 9]
 */