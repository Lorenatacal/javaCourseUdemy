package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was " + switchValue);
                break;
            default:
                System.out.println("Value not 1 or 2");
                break;
        }
        // more code here

        char switchChar = 'C';

        switch(switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Value was " + switchChar);
                break;

            default:
                System.out.println("Value not found ");
        }
    }
}
