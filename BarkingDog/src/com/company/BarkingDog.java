package com.company;

public class BarkingDog {
  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    if(barking && hourOfDay >= 0 && hourOfDay <= 23) {
      boolean getup = hourOfDay < 8 || hourOfDay > 22;
      return getup;
    } else {
      return false;
    }
  }
}
