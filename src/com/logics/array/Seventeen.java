package com.logics.array;

public class Seventeen {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 153, 154, 370, 270, 371};

    static void armstrong() {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i], none = num, copy = num, count = 0, sum = 0;
            while (none != 0) {
                count++;
                none /= 10;
            }
            while (num != 0) {
                int remainder = num % 10;
                sum += (int) Math.pow(remainder, count);
                num /= 10;
            }
            if (copy == sum) {
                System.out.println("Armstrong Numbers are " + copy);
            }
        }
    }

    static void prime() {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            if (arr[i] <= 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Prime Numbers are " + arr[i]);
            }
        }
    }

    static void main(String[] args) {
        armstrong();
        prime();
    }
}

/*
Output:
Armstrong Numbers are 1
Armstrong Numbers are 2
Armstrong Numbers are 3
Armstrong Numbers are 4
Armstrong Numbers are 5
Armstrong Numbers are 6
Armstrong Numbers are 7
Armstrong Numbers are 8
Armstrong Numbers are 9
Armstrong Numbers are 153
Armstrong Numbers are 370
Armstrong Numbers are 371

Prime Numbers are 2
Prime Numbers are 3
Prime Numbers are 5
Prime Numbers are 7
Prime Numbers are 11
Prime Numbers are 13
 */