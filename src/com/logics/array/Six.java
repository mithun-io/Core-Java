package com.logics.array;

import java.util.Arrays;

public class Six {

    // Write a Java program to merge two given arrays into a single array and sort the merged array in ascending order.
    static void without() {
        int[] one = {1, 3, 5, 7, 9};
        int[] two = {2, 4, 6, 8, 0};
        int[] temp = new int[one.length + two.length];
        int j = 0;
        for (int i = 0; i < one.length; i++) {
            temp[j] = one[i];
            j++;
        }
        for (int i = 0; i < two.length; i++) {
            temp[j] = two[i];
            j++;
        }
        Arrays.sort(temp);
        System.out.println("Merged: " + Arrays.toString(temp));
    }

    // Write a Java program to merge two given arrays into a single array and sort the merged array in ascending order using built-in function.
    static void with() {
        int[] one = {1, 3, 5, 7, 9};
        int[] two = {2, 4, 6, 8, 10};
        int[] three = {11, 13, 14, 12, 15};
        int[] temp = new int[one.length + two.length + three.length];
        System.arraycopy(one, 0, temp, 0, one.length);
        System.arraycopy(two, 0, temp, one.length, two.length);
        System.arraycopy(three, 0, temp, one.length + two.length, three.length);
        Arrays.sort(temp);
        System.out.println("Merged: " + Arrays.toString(temp));
    }

    static void main(String[] args) {
        with();
    }
}

/*
Output:
Merged: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
 */