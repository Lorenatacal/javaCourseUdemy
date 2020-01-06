package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("My min Value" + myMinIntValue + "My max Value" + myMaxIntValue);

        int myMaxIntTest = 2147483647;

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;

        System.out.println("My byte minValue" + myMinByte);
        System.out.println("My byte manValue" + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;

        System.out.println("My short minValue" + myMinShort);
        System.out.println("My short manValue" + myMaxShort);

        long myLongValue = 100L;

        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;

        System.out.println("My long minValue" + myMinLong);
        System.out.println("My long manValue" + myMaxLong);

        long bigLongLitValue = 2147483647L;
        System.out.println("My bigLong manValue" + bigLongLitValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByte / 2); //we are casting
        short myNewShort = (short) (myMaxShort /2);

        byte challengeByte = 21;
        short challengeShort = 23694;
        int challengeInt = 123465490;
        long challengeLong = 50000L + 10L *(challengeByte + challengeShort + challengeInt);
        System.out.println("My sum " + challengeLong);
    }
}
