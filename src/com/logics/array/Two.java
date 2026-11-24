package com.logics.array;

import java.util.Arrays;

// Write a Java program to implement Binary Search to find a given element in a sorted array using built-in function.
public class Two {
    static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int target = 60;
        int result = Arrays.binarySearch(arr, target);
        if (result >= 0) {
            System.out.println("Element " + target + " found at the index of " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
