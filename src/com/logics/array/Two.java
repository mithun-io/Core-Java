package com.logics.array;

import java.util.Arrays;

// Write a Java program to implement Linear Search to find a given element in a unsorted array.
public class Two {
    static void main(String[] args) {
        int arr[] = {10, 30, 40, 20, 60, 50};
        int target = 50;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at the index of " + i);
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Element " + target + " not found");
        }
    }
}

/*
Output:
Element 50 found at the index of 5
*/