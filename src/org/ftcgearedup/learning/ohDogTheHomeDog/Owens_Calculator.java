package org.ftcgearedup.learning.ohDogTheHomeDog;

import java.util.Scanner;

public class Owens_Calculator {


    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////Copyright Owen Inc.//////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        int answer;
        answer = 0;

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter a second number: "); //Reads for second number
        int m = reader2.nextInt();

        Scanner reader3 = new Scanner(System.in);
        System.out.println("Enter a function (1 == addition and 2 == subtraction): "); //Reads for function type
        int o = reader3.nextInt();

        System.out.println("Doing the Math...");

        if (o == 1) { //Computes according to function
            answer = n + m;
        }

        if (o == 2) {
            answer = n - m;
        }

        System.out.print(answer); //Prints answer

    }
}
