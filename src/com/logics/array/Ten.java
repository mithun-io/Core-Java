package com.logics.array;

// Write a program to find all pairs of elements in an array whose sum is equal to the given target value.
public class Ten {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}

/*
Output:
1 9
2 8
3 7
4 6
 */