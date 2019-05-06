package com.excp;


import java.util.Arrays;

public class Swapper {

    public static void main(String[] args) {

        int[] arrayOfTen = {2, 5, 6, 1, 9, 7, 3, 2, 8, 9};

        System.out.println("Initial array elements: " + Arrays.toString(arrayOfTen));

        for (int i = 0; i <= arrayOfTen.length - 1; i++) {
            int nextValue = i + 1;
            if (nextValue == 10) {
                break;
            }
            else if (arrayOfTen[i] > arrayOfTen[nextValue]) {
                int temp = arrayOfTen[i];
                arrayOfTen[i] = arrayOfTen[nextValue];
                arrayOfTen[nextValue] = temp;
            }
        }
        System.out.println("Array after swapping elements: " + Arrays.toString(arrayOfTen));
    }

}


