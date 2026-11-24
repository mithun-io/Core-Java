package com.logics.array;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Fourteen {
    static int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

    // Write a program to remove the duplicate elements from an array.
    static void with() {
        Set<Integer> s = new TreeSet<>();
        for (int num : arr) {
            s.add(num);
        }
        System.out.println(s);
    }

    // Write a program to remove the duplicate elements from an array without using collection.
    static void without() {
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void main(String[] args) {
        without();
    }
}

/*
Output:
1 2 3 4 5
 */