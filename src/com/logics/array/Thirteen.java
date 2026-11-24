package com.logics.array;

import java.util.Arrays;

public class Thirteen {
    static int[] one = {1, 2, 3, 4, 5};
    static int[] two = {2, 7, 8, 6, 3};
    static int[] three = {1, 9, 2, 4, 3};

    static void twoArray() {
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < two.length; j++) {
                if (one[i] == two[j]) {
                    System.out.print(one[i] + " ");
                }
            }
        }
    }

    static void threeArray() {
        Arrays.sort(one);
        Arrays.sort(two);
        Arrays.sort(three);
        int i = 0, j = 0, k = 0;
        while (i < one.length && j < two.length && k < three.length) {
            if (one[i] == two[j] && two[j] == three[k]) {
                System.out.print(one[i] + " ");
                i++;
                j++;
                k++;
            } else if (one[i] < two[j]) {
                i++;
            } else if (two[j] < three[k]) {
                j++;
            } else {
                k++;
            }
        }
    }

    static void main(String[] args) {
        threeArray();
    }
}

/*
Output
2 3
 */
