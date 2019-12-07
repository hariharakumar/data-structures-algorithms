package com.hari.codingtest.arrays;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
  Another solution: Put numbers and their counts in hashmap - stream through array and use it as key to search hashmap
 */

public class FindFirstNonRepeatingInteger {

    public static void findFirstNonRepeatingInteger(int[] array) {

        // One solution is to use this - LinkedHashMap maintains order of elements inserted
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap();

        // Figure out how to do this in Java 8:
        for(int i=0 ;i< array.length; i++){
            if(linkedHashMap.containsKey(array[i])) {
                linkedHashMap.put(array[i], linkedHashMap.get(array[i]) + 1);
            }
            else {
                linkedHashMap.put(array[i], 1);
            }
        }

        /*for(Map.Entry<Integer, Integer> item : linkedHashMap.entrySet()) {
            if(item.getValue() == 1) {
                System.out.println("First element");
            }
        }*/

        Map.Entry<Integer, Integer> integerIntegerEntry = linkedHashMap.entrySet().
                stream().
                filter(item -> item.getValue() == 1).
                findFirst().orElse(new AbstractMap.SimpleEntry<Integer, Integer>(-1, -1));

        System.out.println("First non duplicate: " + integerIntegerEntry.getKey());
    }

    public static void main(String[] args) {
        int[] array = {-1,2,-1,3,2};

        findFirstNonRepeatingInteger(array);
    }
}
