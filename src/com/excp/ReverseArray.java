package com.excp;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] oldArray, int n) {

        int[] newArray = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            newArray[j - 1] = oldArray[i];
            j = j - 1;
        }
        System.out.print("Reversed array: " + Arrays.toString(newArray));


    }

    public static void main(String[] args) {

        int[] simpleArray = {10, 15, 20, 25, 30, 35, 40};
        reverse(simpleArray, simpleArray.length);
    }
}
