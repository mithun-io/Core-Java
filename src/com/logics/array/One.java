package com.logics.array;

// Write a Java program to implement Binary Search to find a given element in a sorted array.
public class One {
    static void main(String[] args) {
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
}
