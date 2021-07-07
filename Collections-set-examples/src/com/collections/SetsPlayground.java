package com.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsPlayground {

    public static class BicycleBySpeedComparator implements Comparator<Bicycle> {
        @Override
        public int compare(Bicycle bicycle1, Bicycle bicycle2) {
            Integer speed1 = bicycle1.getSpeed();
            Integer speed2 = bicycle2.getSpeed();

            // returns negative number if speed 1 is greater than speed 2
            // positive number if speed 2 is greater than speed 1
            // zero if they are the same
            return speed2 - speed1;
        }
    }

    public static void playWithStrings() {
        // create a new hashset
        Set<String> names = new HashSet<>();

        // add names
        names.add("Spider-Man");
        String ironman1 = new String("Ironman");
        String ironman2 = new String("Ironman");
        names.add(ironman1);
        names.add(ironman2);

        System.out.println(names);
    }

    public static void playWithBicycles() {
        // create a set
        Set<Bicycle> bicycles = new HashSet<>();

        // add bicycles
        Bicycle blackBicycle = new Bicycle("black", 3);
        Bicycle redBicycle = new Bicycle("red", 5);
        Bicycle greyBicycle = new Bicycle("grey", 10);
        bicycles.add(blackBicycle);
        bicycles.add(redBicycle);
        bicycles.add(greyBicycle);
        // same color and speed as bicycle two lines above... will this work?
        bicycles.add(new Bicycle("black", 3));

        System.out.println(bicycles);

        // show me the hashcodes!
        System.out.println("Red bicycle hashcode: " + redBicycle.hashCode());
        System.out.println("Black bicycle hashcode: " + blackBicycle.hashCode());
        System.out.println("Grey bicycle hashcode: " + greyBicycle.hashCode());
    }

    public static void playWithTreeSet() {
        // create a tree set
        Set<Bicycle> bicyclesOrdered = new TreeSet<>();

        // add bicycles
        Bicycle blackBicycle = new Bicycle("black", 3);
        Bicycle redBicycle = new Bicycle("red", 5);
        Bicycle greyBicycle = new Bicycle("grey", 10);
        bicyclesOrdered.add(blackBicycle);
        bicyclesOrdered.add(redBicycle);
        bicyclesOrdered.add(greyBicycle);

        // print out bicycles (check order)!
        System.out.println(bicyclesOrdered);

        // create another tree set, this time, order by bicycle speed, though
        Set<Bicycle> bicyclesBySpeed = new TreeSet<>(new BicycleBySpeedComparator());
        bicyclesBySpeed.addAll(bicyclesOrdered);

        // print out bicycles, check that ordering makes sense
        System.out.println("Bicycles by speed: " + bicyclesBySpeed);
    }
}
