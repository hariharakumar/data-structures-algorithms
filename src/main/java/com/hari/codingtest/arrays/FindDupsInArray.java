package com.hari.codingtest.arrays;

/* Given a limited range array of size n where array contains elements between 1 and n-1 with one element repeating,
   find the duplicate number in it. */
// https://www.techiedelight.com/find-duplicate-element-limited-range-array/

public class FindDupsInArray {

    private static void findDuplicate(int[] array) {
        // Since array contains elements starting from 1 -> we need to create visited array with size + 1
        boolean[] visited = new boolean[array.length + 1];

        for(int i=0; i < array.length; i++) {
            if(visited[array[i]] == true) {
                System.out.println("Found duplicate element");
            }

            visited[array[i]] = true;
        }

    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,4};
        findDuplicate(array);
    }
}
