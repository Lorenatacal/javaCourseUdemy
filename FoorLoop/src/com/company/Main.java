package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=2; i < 9; i++) {
            System.out.println(calculateInterest(10000, i));
        }
        for(int i=8; i>= 2; i--) {
            System.out.println(calculateInterest(10000, i));
        }

        int count = 0;
        for(int i=10; i<50; i++){
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for(int i=2; i<= n/2; i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static int checkNumber( int n) {
//        for(int i = 0; i<=n; i++) {
//            if(isPrime(i)) {
//                System.out.println(i + n+1);
//            }
//        }
//    }
}
