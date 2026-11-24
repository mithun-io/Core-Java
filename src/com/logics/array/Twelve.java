package com.logics.array;

import java.util.Arrays;
import java.util.Scanner;

// Write a java program to store array elements using Scanner class.
public class Twelve {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size for an array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values for an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}

/*
Output:
Enter the size for an array
5
Enter the values for an array
10
20
30
40
50
[10, 20, 30, 40, 50]
 */
