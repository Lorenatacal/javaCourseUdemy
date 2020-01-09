package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Lorena", 400);
        System.out.println(newScore);
        calculateScore(500);
        calculateScore();
        System.out.println(calculateFeetAndInchesToCentimeters(100));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet <= 0 || (inches <= 0 && inches >=12)) {
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println("Feet: " + feet + "Inches " + inches + "is equal to " + centimeters + " cm");
            return centimeters;
        }
    }

    public static double calculateFeetAndInchesToCentimeters(int inches) {
        if (inches <= 0) {
            return -1;
        } else {
            double feet = (int) inches /12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet " + remainingInches + " inches");

            return calculateFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}
