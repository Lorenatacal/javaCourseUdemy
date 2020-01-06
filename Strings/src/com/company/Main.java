package com.company;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    //sequence of characters, from 1 to 2.14Billion

        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My string is equal to " + myString);
        String numberString =  "250.55 ";
        numberString = numberString + "49.95";
        System.out.println(numberString); //250.55 49.95
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is:" + lastString); //1050
    }
    //Strings in java are immutable, a new string is created by Java
}
