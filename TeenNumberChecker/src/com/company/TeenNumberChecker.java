package com.company;

public class TeenNumberChecker {
  public static boolean hasTeen(int firstNum, int secondNum, int thirdNum) {
    if(isTeen(firstNum) || isTeen(secondNum) || isTeen(thirdNum)) {
      return true;
    }
    return false;
  }

  public static boolean isTeen(int num) {
    if(num >= 13 && num <=19) {
      return true;
    }
    return false;
  }
}
