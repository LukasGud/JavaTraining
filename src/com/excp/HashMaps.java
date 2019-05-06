package com.excp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        HashMap users = new HashMap();

        HashMap<String, Integer> newUser = new HashMap<>();

        users.put("Deshone", 20);
        users.put("Petras", 61);

        if (users.containsKey("Petras")) {
            System.out.println("Dirba");
        } else {
            System.out.println("Samdomas");
        }

        Iterator it = users.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

        System.out.println("Values " + users.values());
        System.out.println("All values: " + users.entrySet());

    }
}
