package com.excp;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        System.out.println("Insert 10 real numbers");

        Scanner sc = new Scanner(System.in);

        int[] numbersArray = new int[10];
        int sumOfArray = 0;
        for (int i = 0; i <= numbersArray.length - 1; i++) {
            System.out.print("Enter No. " + (i + 1) + ": ");
            numbersArray[i] = sc.nextInt();
            sumOfArray += numbersArray[i];
        }
        System.out.println("Sum of these numbers is: " + sumOfArray);
    }
}
