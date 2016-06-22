package org.ftcgearedup.learning.Drago;

/**
 * Created by Mike on 6/2/2016.
 */
public class MikesFibonacciCode {


    public static void main(String[] args) {
        int x = 0;  //1st term
        int y = 1; // 2nd term
        int z = 1; //actual math done with this command
        System.out.println("Here We Go!");
        System.out.println("0");
        System.out.println("1");
        for(int i=0; i<21; i++){
            z = x + y;
            x = y;
            y = z;
            System.out.println(z);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
