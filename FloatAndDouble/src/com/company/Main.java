package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minValue " + myMinFloatValue);
        System.out.println("Float maxValue " + myMaxFloatValue);
        //floats are not very used

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minValue " + myMinDoubleValue);
        System.out.println("Double maxValue " + myMaxDoubleValue);
        //doubles are recommended to be used because they are faster and they are more precise

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntVale= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue=  " + myDoubleValue);

        double pounds = 120d;
        double convertedKilograms = pounds * 0.45359237d;
        System.out.println(convertedKilograms);

    }
}
