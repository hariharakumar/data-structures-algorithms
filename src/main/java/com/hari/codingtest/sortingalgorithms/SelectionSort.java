package com.hari.codingtest.sortingalgorithms;

import java.util.Arrays;

/*
   Each loop try to find minimum element and rearrange elements starting from beginning
   of array so that you will have ascending order array at the end.

   Worst case time complexity : O(n2)

 */
public class SelectionSort {

    public static void selectionSort(int[] array) {

        for(int i=0 ;i < array.length; i++) {
            int minimum = array[i];
            int minIndex = i;

            for(int j=i+1; j < array.length; j++) {
                if(array[j] < minimum) {
                    minimum = array[j];
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void selectionSortApproach2(int[] array) {

        for(int i=0 ;i < array.length; i++) {
            int minimumIndex = i;

            for(int j=i+1; j<array.length; j++) {
                if(array[j] < array[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minimumIndex];
            array[minimumIndex] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {23,9,42,100,6,85,1};
        selectionSort(array);

        int[] array2 = {230,90,420,1000,60,850,10};
        selectionSortApproach2(array2);

    }
}
