package com.bridgelabz.corejavaprograms;

import java.util.Random;
import java.util.Scanner;

public class LeapYear {
    //Main Method
    public static void main(String[] args)
    {
        System.out.println("Welcome to Program for Checking 4 Digit Year as Leap year or Not");

        //Random Class object for generating random number
        Random r = new Random();

        //Variable declaration
        //set upper bound 1000 and lower bound 9999 for generating 4 digit number only
        int year = r.nextInt(1000,9999);

        System.out.println("The Year Number Generated : "+year);

        //Checking Condition for Leap year
        if(year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
    }
}
