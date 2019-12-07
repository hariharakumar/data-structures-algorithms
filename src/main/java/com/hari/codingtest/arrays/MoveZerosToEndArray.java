package com.hari.codingtest.arrays;

import java.util.Arrays;

// Solution should maintain relative order of non zero elements in the array.
// https://www.techiedelight.com/move-zeros-present-array-end/
public class MoveZerosToEndArray {

    public static void moveZerosToEndInArray(int[] array) {

        int j=0;

        // Find all non zero elements and put them first
        for(int i = 0; i< array.length; i++) {
            if(array[i] != 0) {
                array[j++] = array[i];
            }
        }

        // Fill rest of array with 0's
        while (j < array.length) {
            array[j++] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

    // TODO : implement quick sort approach after you learned it.

    public static void main(String[] args) {

        int[] inputArray = {8,0,3,2,1,0,4,0};
        moveZerosToEndInArray(inputArray);
    }
}
