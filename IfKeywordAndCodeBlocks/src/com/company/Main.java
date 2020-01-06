package com.company;

public class Main {

    public static void main(String[] args) {

            calculateScore(true, 800, 5, 100);
            calculateScore(true, 10000, 8, 200);

        }

        public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

          if(gameOver) {
            //scope = variables inside the code block. This can't be access outside of the code block
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=2000;
            System.out.println("Your final score was " + finalScore);
          }
        }
}
