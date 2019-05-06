package com.excp;

import java.util.ArrayList;
import java.util.List;

public class ForTesting {
    public static void main(String[] args) {

        String[] intArray = new String[2];
        intArray[intArray.length - 1] = "labas";

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != null) {
                intArray[i] = null;
            }
            System.out.print(" " + intArray[i]);
            if (intArray.length - 1 == i) {
                System.out.println();
            }
        }
        System.out.println(intArray[intArray.length - 1]);
        List<Integer> intList = new ArrayList<>();
        intList.add(1);

        System.out.println(intArray.length);
        System.out.println(intList.size());
        intList.remove(0);
        System.out.println(intList.size());


    }



}
