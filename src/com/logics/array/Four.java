package com.logics.array;

public class Four {
    int arr[] = {10, 20, 30, 40, 50, 60, 70};

    void firstMin() {
        int first = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                first = arr[i];
            }
        }
        System.out.println("First minimum value is " + first);
    }

    void secondMin() {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second) {
                second = arr[i];
            }
        }
        System.out.println("Second minimum value is " + second);
    }

    void thirdMin() {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE, third = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] < second) {
                third = second;
                second = arr[i];
            } else if (arr[i] < third) {
                third = arr[i];
            }
        }
        System.out.println("Third minimum value is " + third);
    }

    static void main(String[] args) {
        Four f = new Four();
        f.thirdMin();
    }
}

/*
Output:
Third minimum value is 30
*/