package com.collections;

import java.util.*;

public class MapsPlayground {

    public static void play() {
        //creating a Hashmap
        Map<Integer, String> peoplesMap = new HashMap<>();

        // add Key Value Pairs
        peoplesMap.put(1, "Shaz");
        peoplesMap.put(2, "Nathan");
        peoplesMap.put(3, "Bob");
        peoplesMap.put(4, "Andraea");
        peoplesMap.put(5, "Jesse");

        // put if absent (might only work for Java 1.8 and newer? Don't worry if it doesn't work for 1.7)
        peoplesMap.putIfAbsent(6, "Marie");

        System.out.println("peoplesMap after first set of puts: " + peoplesMap);

        // practice: putAll
        Map<Integer, String> newPeople = new HashMap<>();
        newPeople.put(8, "Person 1");
        newPeople.put(9, "Shivani");
        newPeople.put(10, "Hema");

        peoplesMap.putAll(newPeople);

        System.out.println("After adding from newPeople: " + peoplesMap);

        // practice: get (by key)
        System.out.println("Value for entry with key 4: " + peoplesMap.get(4));

        // practice: remove at key
        peoplesMap.remove(8);
        System.out.println("After removing entry with key 8: " + peoplesMap);

        // practice: sort (use a tree map, which will sort according to the keys in natural order)
        //           HashMap makes no guarantee about sorting keys
        //           (although in this example, it does sort Integer keys correctly "by accident")
        TreeMap<Integer, String> sortedPeeps = new TreeMap<>(peoplesMap);

        // iterating/looping
        Set<Map.Entry<Integer, String>> mappingSet = sortedPeeps.entrySet();
        for(Map.Entry<Integer, String> mapping : mappingSet) {
            System.out.println("Mapping key, value : " + mapping.getKey() + " , " + mapping.getValue());
        }

        // practice: loops
        // using keySet
        Set<Integer> keys = sortedPeeps.keySet();
        for (Integer key : keys) {
            String value = sortedPeeps.get(key);
            System.out.println("Value by key (" + key + "): " + value);
        }

        // using values
        Collection<String> justTheValuesPlease = sortedPeeps.values();
        for (String value : justTheValuesPlease) {
            System.out.println("Value from just values list: " + value);
        }
    }
}
