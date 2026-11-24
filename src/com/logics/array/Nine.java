package com.logics.array;

// Write a program to perform Right Rotation of an Array by K positions without creating another array.
public class Nine {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        k = k % arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                System.out.print(arr[arr.length + i - k] + " ");
            } else {
                System.out.print(arr[i - k] + " ");
            }
        }
    }
}

/*
Output:
4 5 1 2 3
 */
