package org.ftcgearedup.learning.dpt;

/**
 * Created by daniel on 6/3/16.
 */
public class FibonacciChallenge {
    public static void main(String[] args) {

        // The method fib(n) returns the nth number in the fibonacci sequence.
        // The fibonacci sequence is considered to start with 0, not 1.

        // Loop through the first 10 fibonacci numbers:
        for(int i = 1; i <= 10; i++) {
            System.out.println(fib(i));
        }

        System.out.println("=========");

        // The method fib2(n) prints the first n numbers of the fibonacci sequence.

        // Print the first 10 numbers in the Fibonacci sequence:
        fib2(10);
    }

    private static int fib(int n) {
        return n <= 2 ? n - 1: fib(n - 1) + fib(n - 2);
    }

    private static void fib2(int n) {
        int a = 0;
        int b = 1;
        int temp;
        for(; n > 0; n--) {
            temp = a + b;
            System.out.println(a);
            a = b;
            b = temp;
        }
    }

}
