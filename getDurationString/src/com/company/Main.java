package com.company;

public class Main {

    public static void main(String[] args) {
        getDurationString(65, 45);
        getDurationString(3945);
    }

    public static String getDurationString(int minutes, int seconds) {
        if(seconds > 59 || seconds < 0 || seconds < 0  ) {
            System.out.println("Invalid value");
            return "Invalid value";
        } else {
            int hours = minutes / 60;
            minutes %=60;
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
            return (hours + "h " + minutes + "m " + seconds + "s").toString();
        }
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid value";
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60 ;
            return getDurationString(minutes, remainingSeconds);
        }
    }



}
