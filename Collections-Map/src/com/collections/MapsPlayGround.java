package com.collections;

import java.util.*;

public class MapsPlayGround {

    public static void play() {

        //creating a Hashmap
        Map<Integer, String> peoplesMap = new HashMap<>();
        Map<Integer, String> newPeople = new HashMap<>();


        // New People Entries

        newPeople.put(8, "Person 1");
        newPeople.put(9, "Shivani");
        newPeople.put(10, "Hema");


        //add Key Value Pairs
        peoplesMap.put(1, "Brendon");
        peoplesMap.put(2, "Nathan");
        peoplesMap.put(3, "Bob");
        peoplesMap.put(4, "Andraea");
        peoplesMap.put(5, "Jesse");




        // put if absent // Return values only
        peoplesMap.putIfAbsent(6, "Marie");


        // practice: putAll
        peoplesMap.putAll(newPeople);


        // practice: get (by Key)
        System.out.println(peoplesMap.get(4));


        // practice: remove at key
        peoplesMap.remove(8);
        System.out.println(peoplesMap.values());


        // practice: sort
        TreeMap<Integer, String> sortedPeeps = new TreeMap<>(peoplesMap);

        //Entry Object must have been created
        //Set must be created
        //For iteration to happen

        //Method 1
        Set<Map.Entry<Integer, String>> mappings = sortedPeeps.entrySet();
        System.out.println("Values after sorting");
        for(Map.Entry<Integer, String> mapping : mappings){
            System.out.println(mapping.getKey() + mapping.getValue());
        }

        //Method 2
        Set<Map.Entry<Integer, String>> mappingSet = sortedPeeps.entrySet();
        for(Map.Entry<Integer, String> mapping : mappingSet) {
            System.out.println("Mapping key, value : " + mapping.getKey() + " , " + mapping.getValue());
        }


        //Method 3
        Set<Integer> keys = sortedPeeps.keySet();
        for (Integer key : keys) {
            String value = sortedPeeps.get(key);
            System.out.println("Value by key (" + key + "): " + value);
        }

        //Method 4
        Collection<String> justTheValuesPlease = sortedPeeps.values();
        for (String value : justTheValuesPlease) {
            System.out.println("Value from just values list: " + value);
        }





    }
}
