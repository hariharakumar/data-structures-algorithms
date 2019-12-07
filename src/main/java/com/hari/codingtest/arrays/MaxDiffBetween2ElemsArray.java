package com.hari.codingtest.arrays;

/*
  Given array of integers,
   Find max difference between 2 elements in the array such that smaller element appears before the larger element.
   https://www.techiedelight.com/find-maximum-difference-between-two-elements-array/
 */

public class MaxDiffBetween2ElemsArray {

    private static void findMaxDiff(int[] array) {

        int maxSoFar = array[array.length-1];
        int diff = 0;

        for(int i = array.length-2; i>=0; i--) {
            if(array[i] > maxSoFar) {
                maxSoFar = array[i];
            }

            diff = Integer.max(diff, maxSoFar- array[i]);

        }
        System.out.println("Max diff: " + diff);
    }

    public static void main(String[] args) {
        int[] array = {2,7,9,5,1,3,5};
        findMaxDiff(array);

    }
}
