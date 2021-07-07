package com.fego;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirstListExcercise {

    public static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String string1, String string2) {
            return string1.compareTo(string2);
        }
    }


    public static void Play() {
        // write your code here




        // Step 1
        List<String> rockstarList = new ArrayList<>();






        // Step 2
        rockstarList.add("Nathan Murphy");
        rockstarList.add("Shailaja U");
        rockstarList.add("Jake Scott ");
        rockstarList.add("Cian Lych");
        rockstarList.add("Hema Duraisingam ");
        rockstarList.add("Andraea Zambakides");
        rockstarList.add("Indie F");
        rockstarList.add("Aaron P");
        rockstarList.add("Marie F");
        rockstarList.add("Plamena petkova");
        rockstarList.add("Shaz setoodeh");







        // Step 3
        String longest = "";
        for(int i = 0; i < rockstarList.size(); i ++){
            if(rockstarList.get(i).length() > longest.length()){
                longest = rockstarList.get(i);
            }
        }

        System.out.println("longest name is: " + longest);







        // Step 4 Count of names longer than 10 characters
        int count = 0;
        for(int i = 0; i < rockstarList.size(); i ++){
            if(rockstarList.get(i).length() > 10){
                count++;
            }
        }

        System.out.println("count of names longer than 10 characters: " + count);







        // Step 5
        // str = "abcd";

        // Hint : to get last index of an array or list or string --> subtract 1 from its length
        // str.charAt(str.length()-1);
        int nameCount = 0;
        for(int i = 0; i < rockstarList.size(); i ++){
            if(rockstarList.get(i).charAt(rockstarList.get(i).length()-1) == 'n'){
                System.out.println("name ending with an n is at index: " + i);
                break;

            }
                else {
                    nameCount++;
            }
        }

        if(nameCount == rockstarList.size()){
            System.out.println("No name found");
        }





        // Step 6, Call our startingWith function :)

        startingWith(rockstarList, 'I');





        // step 7
        List<String> newRockstarList = new ArrayList<>();
        for(int i = 0; i < rockstarList.size(); i ++){
            if(rockstarList.get(i).length() < 8){
                newRockstarList.add(rockstarList.get(i));
            }
        }
        System.out.println("New Rockstar List");


        // step 8
        rockstarList.sort(new StringComparator());



    }






    // Step 6
    public static void startingWith (List<String> listToCheck, Character character ){

        System.out.println("All names that begin with "+ character + " are listed below :)");

        for(int i = 0 ; i < listToCheck.size(); i++){
            if(listToCheck.get(i).charAt(0) == character){
                System.out.println(listToCheck.get(i));
            }
        }
    }









    }

