package org.ftcgearedup.learning.Drago;

import java.util.Scanner;

/**
 * Created by Mike on 6/2/2016.
 */
public class Lock {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print ("Enter Password Here: ");
        String x = reader.nextLine();
        if(x.equals("6347")) {
            System.out.println("Access granted, Master!");

        }
        else {
            for (int i = 1; i<21; i++){
                System.out.println("NO!");
            }



        }


    }

}
