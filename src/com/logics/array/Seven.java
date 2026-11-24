package com.logics.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Seven {
    static void sortArray() {
        int[] arr = {1, 3, 5, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort: " + Arrays.toString(arr));
    }

    static void sortCollection() {
        List<Integer> l = Arrays.asList(1, 3, 5, 2, 4);
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size() - 1 - i; j++) {
                if (l.get(j) > l.get(j + 1)) {
                    int temp = l.get(j);
                    l.set(j, l.get(j + 1));
                    l.set(j + 1, temp);
                }
            }
        }
        System.out.println(l);
    }

    static void builtIn() {
        List<Integer> l = Arrays.asList(1, 3, 5, 2, 4);
        Collections.sort(l);
        System.out.println(l);
    }

    static void main(String[] args) {
        builtIn();
    }
}

/*
Output:
[1, 2, 3, 4, 5]
 */
