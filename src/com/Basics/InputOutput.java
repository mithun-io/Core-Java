package com.Basics;

import java.util.Scanner;

public class InputOutput {
    // Write a program which takes two numbers from the user as input, add them, and display their sum as output
    static void add() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int b = scanner.nextInt();

        int result = a + b;
        System.out.println("Result: " + result);

        scanner.close();
    }

    // Write a Java program using the Scanner class to collect the following information from a student.
    static void typesOfInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your e-mail id: ");
        String email = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your mobile number: ");
        long mobile = scanner.nextLong();

        System.out.print("Enter your height: ");
        float height = scanner.nextFloat();

        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        System.out.print("Are you currently studying? true/false: ");
        boolean flag = scanner.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age : " + age);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Height: " + height);
        System.out.println("Percentage: " + percentage);
        System.out.println("Is student studying? " + flag);
    }

    static void main() {
        typesOfInput();
    }
}

/*
Output:
Enter your name: John Doe
Enter your e-mail id: johndoe@outlook.com
Enter your age: 21
Enter your mobile number: 9876543210
Enter your height: 5.9
Enter your percentage: 80.00
Are you currently studying? true/false: true

Name: John Doe
Email: johndoe@outlook.com
Age : 21
Mobile Number: 9876543210
Height: 5.9
Percentage: 80.0
Is student studying? true
 */