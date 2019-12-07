package com.hari.codingtest.arrays;

// https://www.geeksforgeeks.org/find-the-missing-number/
public class FindMissingNumberInArray {

    public static void findMissingNumber(int[] numbers, int totalCount) {

        boolean[] boolArray = new boolean[totalCount + 1];

        for(int i=0; i< numbers.length; i++) {
            boolArray[numbers[i]] = true;
        }

        for(int i=0; i< boolArray.length; i++) {
            if(!boolArray[i]) {
                System.out.println("Found it: " + i);
            }
        }
    }

    public static void main(String[] args) {

        int totalCount = 8;
        int[] numbers = {1,2,4,3,6,7,8};

        findMissingNumber(numbers, totalCount);
    }
}
