package com.hari.codingtest.arrays;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

    public static void commonWord(String[] arr) {

        HashMap<String, Integer> data = new HashMap<>();
        int finalCount = 0;
        String maxRepeatString = null;

        for(int i = 0; i < arr.length; i++) {

            if(data.containsKey(arr[i])) {
                Integer count = data.get(arr[i]);
                data.put(arr[i], ++count);
            }
            else {
                data.put(arr[i], 1);
            }
        }

        /*for(String item: data.keySet()) {
            if(data.get(item) > finalCount) {
                finalCount = data.get(item);
                maxRepeatString = item;
            }
        }*/

        Map.Entry<String, Integer> resultWithMaxCount = data.entrySet().
                stream().
                sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).
                findFirst().
                get();

        System.out.println("Max Count: " + resultWithMaxCount.getValue() + " Word: " + resultWithMaxCount.getKey());

    }

    public static void main(String[] args) {

        String arr[] = { "geeks", "for", "geeks", "a",
                "portal", "to", "learn", "can", "be",
                "computer", "science", "zoom", "yup",
                "fire", "in", "be", "data", "geeks" };

        commonWord(arr);

    }
}
