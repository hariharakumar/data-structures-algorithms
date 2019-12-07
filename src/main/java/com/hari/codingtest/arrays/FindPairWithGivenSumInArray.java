package com.hari.codingtest.arrays;

/* Given unsorted array of integers find pair with given sum in it.
   Ex : Arr : [8,7,2,5,3,1]
        Sum = 10
        Output :
           Pair found at index 0 and 2
           Pair found at index 1 and 4

        // Naive approach: for each element, loop through rest of array and check if elements are found - this will be 0(n2) time complexity -> Not a good idea.
*/

import java.util.Arrays;
import java.util.HashMap;

public class FindPairWithGivenSumInArray {

    // o(nlogn) approach
    private static void OrderOfNLogNApproach(int[] array, int expectedSum) {

        // Sort the array in ascending order
        Arrays.sort(array);

        int low = 0;
        int high = array.length - 1;

        while (low < high)
        {
            if(array[low] + array[high] == expectedSum) {
                System.out.println("Pair found");
                return;
            }

            if ((array[low] + array[high] > expectedSum)) {
                high--;
            }
            else {
                low++;
            }
        }
        System.out.println("Pair not found");
    }

    private static void OrderOfNApproach(int[] array, int expectedSum) {
        // Maintain a hashmap with value at index as key and index number as value

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< array.length; i++)
        {
            if(map.containsKey(expectedSum - array[i])) {
                System.out.println("Found pair at index : " + i + " and  " + map.get(expectedSum - array[i]));
                return;
            }
            map.put(array[i], i);
        }
        System.out.println("Pair not found");
    }

    public static void main(String[] args) {

        int expectedSum = 10;

        int[] array1 = { 8, 7, 2, 5, 3, 1 };
        OrderOfNLogNApproach(array1, expectedSum);

        int[] array2 = { 8, 7, 2, 5, 3, 1 };
        OrderOfNApproach(array2, expectedSum);

    }

}
