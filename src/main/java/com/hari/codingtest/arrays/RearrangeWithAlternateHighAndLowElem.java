package com.hari.codingtest.arrays;

import java.util.Arrays;

/* Given an array of integers, rearrange the array such that every second element of the array
   is greater than its left and right elements. Assume no duplicate elements in the array.
   https://www.techiedelight.com/rearrange-the-array-with-alternate-high-and-low-elements/
* */
public class RearrangeWithAlternateHighAndLowElem {

    // o(nlogn) time complexity
    private static void reArrange(int[] array) {
        Arrays.sort(array);

        for(int i=0; i< array.length ;i++) {
            if(i%2 != 0) {
              if(array[i] < array[i+1]) {
                  int temp = array[i];
                  array[i] = array[i+1];
                  array[i+1] = temp;
              }
            }
        }

        System.out.println(Arrays.toString(array));
    }

    // o(n) time complexity - Start from 2nd element of array and increment index by 2
    // If prev element is greater than current elem, we swap - if next element is greater than current elem, we swap.
    private static void reArrangeTimeComplexityOrderN(int[] array) {

        for (int i = 1; i < array.length; i += 2)
        {
            // If the prev element is greater than current element,
            // swap the elements
            if (array[i - 1] > array[i]) {
                swap(array, i - 1, i);
            }

            // if next element is greater than current element,
            // swap the elements
            if (i + 1 < array.length && array[i + 1] > array[i]) {
                swap(array, i + 1, i);
            }
        }
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {

        int[] array = {1,3,2,4,5,6,7};
        reArrange(array);

        int[] array1 = {1,3,2,4,5,6,7};
        reArrangeTimeComplexityOrderN(array1);

    }
}
