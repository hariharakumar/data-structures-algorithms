package com.hari.codingtest.searchalgorithms;

import java.util.stream.IntStream;

public class LinearSearch {

    public static int linearSearch(int[] array, int element) {
        /* this returns the element and not index
        return Arrays.stream(array).
               filter(item -> item == element).
               findAny().
               orElse(-1);*/

        return IntStream.range(0, array.length).
               filter(item -> array[item] == element).
               findAny().
               orElse(-1);
    }

    public static void main(String[] args) {
        int[] array = {12,9,5,2,100,85};
        System.out.println("100 Found at index: " + linearSearch(array, 100));
    }

}
