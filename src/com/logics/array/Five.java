package com.logics.array;

import java.util.Arrays;

public class Five {
    // Write a java program to print all the zeroes at last.
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 0, 3, 0, 4};
        int j = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}

/*
Output:
[1, 2, 3, 4, 0, 0, 0, 0]
 */