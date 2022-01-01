package com.bridgelabz.functionalprogram;

public class EuclideanDistance {
    public static void main(String[] args) {
        //Variable Declaration
        int x, y;
        double euclidenaDistance = 0.0;

        //Accepting Command Line Argumnet in x and y
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);

        System.out.println("The Value for Point X : " + x);
        System.out.println("The Value for Point Y : " + y);

        //Calculating the Euclidena Distance using Math.sqrt() and Mth.pow()
        euclidenaDistance = Math.sqrt( Math.pow(x,x) + Math.pow(y,y) );

        System.out.println("Euclidean Distance : "+ euclidenaDistance);
    }
}
