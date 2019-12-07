package com.hari.codingtest.sortingalgorithms;

/*
    Each time you maintain a sorted array on the left starting with first element and parse rest of array to insert elements in the sorted array on left.
    Its called insertion sort because you are inserting elements into already sorted array on left.

    Worst case time complexity : O(n2)
 */

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {

        // First element in array is sorted by itself - hence we start with second element in the array
        for(int i=1 ; i < array.length; i++) {
            int elementToSort = array[i];
            int j = i-1;

            while (j >=0 && array[j] > elementToSort) {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = elementToSort;
        }

        System.out.println("Sorted Array: " + Arrays.toString(array));

    }

    public static void main(String[] args) {
        int[] array = {23,9,11,4,6,93,100};

        insertionSort(array);
    }
}
