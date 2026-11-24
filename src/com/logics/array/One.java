package com.logics.array;

import java.util.Arrays;

public class One {
    // Write a Java program to implement Binary Search to find a given element in a sorted array.
    static void without() {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int target = 60, low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Element " + target + " found at the index of " + mid);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    // Write a Java program to implement Binary Search to find a given element in a sorted array using built-in function.
    static void with() {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int target = 60;
        int result = Arrays.binarySearch(arr, target);
        if (result >= 0) {
            System.out.println("Element " + target + " found at the index of " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    static void main(String[] args) {
        without();
    }
}

/*
Output:
Element 60 found at the index of 5
*/