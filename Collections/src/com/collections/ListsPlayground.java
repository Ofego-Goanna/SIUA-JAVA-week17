package com.collections;

import java.util.*;

public class ListsPlayground {
    // comparator to help sort ArrayList of Strings
    public static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String string1, String string2) {
            return string1.compareTo(string2);
        }
    }


    public static void play() {
        List<String> stringsList = new ArrayList<>();
        stringsList.add("Bart");
        stringsList.add("Maggie");

        // practice: addAll
        stringsList.addAll(Arrays.asList("Homer", "Marge", "Lisa", "Flanders", "Santa's Little Helper"));

        // practice: get (by index)
        System.out.println("Character at index 3: " + stringsList.get(3));

        // practice: add at index, remove at index
        stringsList.add(3, "Barney");

        // practice: copy list
        List<String> copiedList = new ArrayList<>(stringsList);
        System.out.println("Copied list: " + copiedList);

        // practice: sort
        stringsList.sort(new StringComparator());

        // practice: removeAll / retainAll
        List<String> notSimpsons = new ArrayList<>();
        notSimpsons.addAll(Arrays.asList("Cartman", "Kyle", "Superman", "Peter"));
        stringsList.addAll(0, notSimpsons);
        System.out.println("After adding non simpsons: " + stringsList);
        stringsList.removeAll(notSimpsons);

        notSimpsons.retainAll(Arrays.asList("Cartman", "Peter", "Batman"));
        System.out.println("notSimpsons after retainAll: " + notSimpsons);

        System.out.println(stringsList);
        System.out.println("Size: " + stringsList.size());

        // practice: loops
        int countWithA = 0;
        for (String characterName : stringsList) {
            // do something with characterName
            if (characterName.contains("a") || stringsList.contains("A")) {
                countWithA++;
            }
        }
        System.out.println("Characters with the letter a in their names: " + countWithA);
    }
}
