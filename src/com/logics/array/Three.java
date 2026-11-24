package com.logics.array;

public class Three {
    static int[] arr = {20, 30, 60, 40, 50, 10, 70};

    // Write a Java program to print first maximum element.
    static void firstMax() {
        int first = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
        }
        System.out.println("First maximum element is " + first);
    }

    // Write a Java program to print second maximum element.
    static void secondMax() {
        int first = 0, second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println("Second maximum element is " + second);
    }

    // Write a Java program to print third maximum element.
    static void thirdMax() {
        int first = 0, second = 0, third = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println("Third maximum element is " + third);
    }

    static void main(String[] args) {
        thirdMax();
    }
}
