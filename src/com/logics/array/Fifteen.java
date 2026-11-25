package com.logics.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class Fifteen {
    static int[] arr = {1, 1, 2, 3, 3, 4, 5, 5};

    // Write a java program to print the frequency of an array.
    static void frequency() {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Element Frequency");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Write a java program to print the unique elements of an array.
    static void unique() {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Unique Elements");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    // Write a java program to print the duplicate elements of an array.
    static void duplicate() {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Duplicate Elements");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    static void main(String[] args) {
        frequency();
        unique();
        duplicate();
    }
}

/*
Output:
Element Frequency
1 -> 2
2 -> 1
3 -> 2
4 -> 1
5 -> 2
Unique Elements
2 -> 1
4 -> 1
Duplicate Elements
1 -> 2
3 -> 2
5 -> 2
 */