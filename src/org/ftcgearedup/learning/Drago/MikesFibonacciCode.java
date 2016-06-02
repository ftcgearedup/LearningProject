package org.ftcgearedup.learning.Drago;

/**
 * Created by Mike on 6/2/2016.
 */
public class MikesFibonacciCode {


    public static void main(String[] args) {
        int x = 1;  //1st term
        int y = 1; // 2nd term
        int z = 1; //actual math done with this command
        System.out.println("Here We Go!");
        for(int i=1; i<21; i++){
            z = x + y;
            x = y;
            y = z;
            System.out.println(z);
        }

    }


}
