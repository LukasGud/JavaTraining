package com.excp;


import java.util.Arrays;

public class JoinTwoArrays {
    public static void main(String[] args) {

        int[] firstArray = {10, 20, 30, 40};
        int[] secondArray = {50, 60, 70, 80};

        int[] thirdArrayLength = new int[firstArray.length + secondArray.length];
        int j = 0, k = 0, l = 0;

        for (int i = 0; i < thirdArrayLength.length; i++) {
            if (j < firstArray.length)
                thirdArrayLength[l++] = firstArray[j++];
            if (k < secondArray.length)
                thirdArrayLength[l++] = secondArray[k++];
        }
        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        System.out.println("Merged array with every second element inserted: " + Arrays.toString(thirdArrayLength));
        ReverseArray.reverse(thirdArrayLength, thirdArrayLength.length);


    }
}
