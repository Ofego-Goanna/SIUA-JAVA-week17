package com.collections;

import java.util.*;

public class CombinedPlayground {

    // my own speed comparator, slowest first
    public static class BicycleBySlowerSpeedComparator implements Comparator<Bicycle> {

        @Override
        public int compare(Bicycle o1, Bicycle o2) {
            // reusing the comparator which sorts by highest speed first, but changing the parameters around
            SetsPlayground.BicycleBySpeedComparator otherComparator = new SetsPlayground.BicycleBySpeedComparator();
            return otherComparator.compare(o2, o1);
        }
    }

    // playing with maps, sets, lists, all in one method
    public static void play() {
        // create and fill a map. keys are some number, value is the bicycle
        Map<Integer, Bicycle> numberToBicycleMap = new HashMap<>();
        numberToBicycleMap.put(10, new Bicycle("mauve", 10));
        numberToBicycleMap.put(14, new Bicycle("purple", 14));
        numberToBicycleMap.put(3, new Bicycle("red", 3));
        numberToBicycleMap.put(5, new Bicycle("black", 5));
        numberToBicycleMap.put(9, new Bicycle("grey", 9));
        numberToBicycleMap.put(1, new Bicycle("gold", 2));
        numberToBicycleMap.put(2, new Bicycle("black", 5));
        numberToBicycleMap.put(4, new Bicycle("black", 5));
        numberToBicycleMap.put(6, new Bicycle("black", 5));

        System.out.println("Map looks like this: " + numberToBicycleMap);

        // get all bicycles as a list
        Collection<Bicycle> bicycleList = numberToBicycleMap.values();

        System.out.println("Collection looks like this: " + bicycleList);

        // reduce the list to unique bicycles only (ie. get rid of duplicates)
        Set<Bicycle> uniqueBicycles = new HashSet<>(bicycleList);
        System.out.println("Set of bicycles is: " + uniqueBicycles);

        // sort uniques by speed: slowest first, using another comparator
        Set<Bicycle> bicyclesBySpeed = new TreeSet<>(new BicycleBySlowerSpeedComparator());
        bicyclesBySpeed.addAll(uniqueBicycles);
        System.out.println("Sorted by slower speed first: " + bicyclesBySpeed);
    }
}
