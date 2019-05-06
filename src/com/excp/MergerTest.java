package com.excp;

import java.util.Arrays;

import static com.excp.Merger.merge;

public class MergerTest {
    public static void main(String[] args) {


        int[] firstArray = {10, 20, 30 ,40};
        int[] secondArray = {50, 60, 70, 80, 90};
        System.out.println("First array elements: " + Arrays.toString(firstArray));
        System.out.println("Second array elements: " + Arrays.toString(secondArray));

        int[] thirdArray = merge(firstArray, secondArray);
        System.out.println("Merged array: " + Arrays.toString(thirdArray));
    }
}
