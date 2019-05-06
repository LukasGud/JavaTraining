package com.excp;

class Merger {

    static int[] merge(int[] a, int[] b) {

        int[] mergedArray = new int[a.length + b.length];
        int j = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (i < a.length) {
                mergedArray[i] = a[i];
            } else {
                mergedArray[i] = b[j];
                j++;
            }
        }
        return mergedArray;
    }
}
