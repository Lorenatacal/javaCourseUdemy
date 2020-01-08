package com.company;

public class DecimalComparator{
  public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
    firstNum = firstNum * 1000;
    secondNum = secondNum * 1000;
    int firstNum1 = (int) firstNum;
    int secondNum2 = (int) secondNum;

    if(firstNum1 == secondNum2) {
      return true;
    }
    return false;
  }
}