package com.company;

public class Main {

  public static void main(String[] args) {

    calculateScore(true, 800, 5, 100);
    calculateScore(true, 10000, 8, 200);
    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Alessia", highScorePosition);
    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Tudor", highScorePosition);
    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("Lorena", highScorePosition);
    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("Laura", highScorePosition);

  }

  public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if (gameOver) {
      //scope = variables inside the code block. This can't be access outside of the code block
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 2000;
      System.out.println("Your final score was " + finalScore);
    }
  }

  public static void displayHighScorePosition(String playersName, int position) {
    System.out.println(playersName + " managed to get into position " + position);
  }

  public static int calculateHighScorePosition(int playerScore) {
    if (playerScore >= 1000) {
      return 1;
    } else if (playerScore > 500 && playerScore < 1000) {
      return 2;
    } else if (playerScore >= 100 && playerScore < 500) {
      return 3;
    }
    return 4;
  }
}
