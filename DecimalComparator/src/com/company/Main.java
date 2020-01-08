package com.company;

import static com.company.DecimalComparator.areEqualByThreeDecimalPlaces;

public class Main {

    public static void main(String[] args) {
      System.out.println(areEqualByThreeDecimalPlaces(1.5678, 1.56789));
    }
}
