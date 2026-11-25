package com.logics.array;

import java.util.HashSet;
import java.util.Set;

public class Sixteen {
    static int arr[] = {1, 2, 3, 3, 4, 5, 5};

    // Write a java program to print first repeating element of an array.
    static void first() {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("First Repeating Element is " + num);
                break;
            }
        }
    }

    // Write a java program to print second repeating element of an array.
    static void second() {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int num : arr) {
            if (!set.add(num)) {
                count++;
                if (count == 2) {
                    System.out.println("Second Repeating Element is " + num);
                    break;
                }
            }
        }
    }

    static void main(String[] args) {
        first();
        second();
    }
}

/*
Output:
First Repeating Element is 3
Second Repeating Element is 5
 */