package com.excp;

import java.util.Arrays;

public class DuplicateFinder {
    public static void main(String[] args) {

        int[] newArraysOfTen = {2, 5, 6, 2, 9, 7, 3, 2, 8, 9};

        System.out.println("Initial array: " + Arrays.toString(newArraysOfTen));
        Arrays.sort(newArraysOfTen);

//        for (int i = 0; i < newArraysOfTen.length; i++) {
//            for (int j = i + 1; j < newArraysOfTen.length; j++) {
//                if (newArraysOfTen[i] == newArraysOfTen[j]) {
//
//                    System.out.println("Duplicate elements are: " + newArraysOfTen[i]);
//                }
//            }
//        }

        boolean[] done = new boolean[newArraysOfTen.length];
        for(int i = 0; i < newArraysOfTen.length; i++) {
            if(done[i])
                continue;
            int nb = 0;
            for(int j = i; j < newArraysOfTen.length; j++) {
                if(done[j])
                    continue;
                if(newArraysOfTen[j] == newArraysOfTen[i]) {
                    done[j] = true;
                    nb++;
                }
            }
            System.out.println(newArraysOfTen[i] + " occurs " + nb + " times");
        }
    }
}






