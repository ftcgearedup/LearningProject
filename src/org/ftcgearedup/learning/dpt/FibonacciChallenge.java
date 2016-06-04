package org.ftcgearedup.learning.dpt;

/**
 * Created by daniel on 6/3/16.
 */
public class FibonacciChallenge {
    public static void main(String[] args) {

        // fib(n) outputs the nth number in the fibonacci sequence.
        // The fibonacci sequence is considered to start with 0, not 1.

        // Examples:
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(5));
        System.out.println(fib(8));

        System.out.println("=========");

        // Loop through the first 10 fibonacci numbers:
        for(int i = 1; i <= 10; i++) {
            System.out.println(fib(i));
        }
    }

    private static int fib(int n) {
        return n <= 2 ? n - 1: fib(n - 1) + fib(n - 2);
    }

}
