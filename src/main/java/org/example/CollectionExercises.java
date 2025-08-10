package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String[] fruitArray = new String[size];
        for (int i = 0;i < size; i++){
            fruitArray[i] = "apple";
        }
        return fruitArray;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        String[] newFruitArray = {fruits[0], fruits[1], fruits[2]};
        return newFruitArray;

        // or could do
        // return new String[] {fruits[0], fruits[1], fruits[2]};
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String> fruitArrayList = new ArrayList<String>();
        fruitArrayList.add("apple");
        fruitArrayList.add("banana");
        fruitArrayList.add("cherry");
        fruitArrayList.add("date");
        fruitArrayList.add("elderberry");
        return fruitArrayList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> threeFruitList = new ArrayList<>();
        threeFruitList.add(fruit1);
        threeFruitList.add(fruit2);
        threeFruitList.add(fruit3);
        return threeFruitList;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String,String> fruitMap = new HashMap<>();
        fruitMap.put("apple","red");
        fruitMap.put("banana","yellow");
        fruitMap.put("cherry","red");
        fruitMap.put("date","brown");
        fruitMap.put("elderberry","black");
        return fruitMap;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        String fruitMapFruit = fruitMap.get("apple");
        return fruitMapFruit;

        // or
        // return fruitMap.get("apple");
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> fruitSet = new HashSet<String>();
        fruitSet.add(fruit1);
        fruitSet.add(fruit2);
        fruitSet.add(fruit3);
        return fruitSet;
    }
}
