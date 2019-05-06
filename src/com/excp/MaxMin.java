package com.excp;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {


        int[] numbersArray = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 real numbers");
        for (int i = 0; i <= numbersArray.length - 1; i++) {
            System.out.println("Enter No. " + (i +1) + ": ");
            numbersArray[i] = sc.nextInt();
        }
        int inputMin = numbersArray[0];
        int inputMax = numbersArray[0];
            for (int j = 0; j <= numbersArray.length - 1; j++) {
                if (inputMin >= numbersArray[j]) {
                    inputMin = numbersArray[j];
                }
                if (inputMax <= numbersArray[j]) {
                    inputMax = numbersArray[j];
                }
            }
            System.out.println("Array Min number is " + inputMin + " Max number is " + inputMax);
    }
}
