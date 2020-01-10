package com.company;

public class Main {

    public static void main(String[] args) {
      printYearsAndDays(525600);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0 ) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = minutes /(24 * 60);
            long years = minutes / (365 * 24 * 60);
            long remainingDays = days %(365);
            System.out.println((minutes + " min = " + years + " y and " + remainingDays + " d").toString());
        }
    }

}
