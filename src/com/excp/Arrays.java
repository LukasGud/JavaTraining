package com.excp;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        //Array
        int[] arrInts = {2, 4, 6, 9};
        String [] arrStrings = {"Lukas", "Vilius", "Antanas", "Arvydas"};

        for (int i = 0; i < arrInts.length; i++) {
            System.out.println("Item #: " + arrInts[i]);

        }
        for (int i = 0; i < arrStrings.length; i++) {
            System.out.println("Names: " + arrStrings[i]);
        }
        //ArrayLists
        ArrayList people = new ArrayList();
        people.add(0,"White");
        people.add(1,"China");
        people.add(2,"Black");
        people.add(3,"Brownies");
        people.remove(1);
        people.remove("Black");
        people.add(2,34);
        System.out.println(people.size());

        if (people.contains("brownies")) {
            people.add("Mexicans");
        } else {
            people.add("African americans");
        }
        System.out.println(people.indexOf("Mexicans"));

        if (people.isEmpty()) {
            System.out.println("It`s empty");
        } else {
            for (Object species : people) {
                System.out.println("People: " + species);
            }
        }

        for (int i = 0; i < people.size(); i++) {
           // System.out.println("Species " + people.get(i));
        }


        //System.out.println("Size: " + people.size());
    }



}
