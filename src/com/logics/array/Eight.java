package com.logics.array;

// Write a java program to find the missing value in an array.
public class Eight {
    static void main(String[] args) {
        int[] arr = {2, 1, 3, 6, 4, 7};
        int n = arr[arr.length - 1], total = n * (n + 1) / 2, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Missing value is " + (total - sum));
    }
}

/*
Output:
Missing value is 5
 */