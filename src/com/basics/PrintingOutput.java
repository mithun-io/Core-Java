package com.basics;

// Write a program provides the standard output stream System.out for displaying information on the console
public class PrintingOutput {
    // The print() method displays output without adding a new line.
    static void print() {
        System.out.print("Hello ");
        System.out.print("World");
    }

    // The println() method prints the given value and then moves the cursor to the next line.
    static void println() {
        System.out.println("Hello ");
        System.out.println("World");
    }

    // The printf() method is used when formatted output is required.
    static void printf() {
        String name = "John Doe";
        int age = 21;
        System.out.printf("Name: %s, Age: %d%n", name, age);
    }

    static void main() {
        println();
        printf();
        print();
    }
}

/*
Output;
Hello
World
Name: John Doe, Age: 21
Hello World
 */
