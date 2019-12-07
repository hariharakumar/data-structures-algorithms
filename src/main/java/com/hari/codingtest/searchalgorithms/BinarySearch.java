package com.hari.codingtest.searchalgorithms;

/* ARRAY NEED TO BE SORTED for binary search to be applicable
   We find mid element in given array and check if search element is less than or more than arrays mid element
   if search element is lower than mid element, we will ignore right part of mid and only search for left part of mid
*/
public class BinarySearch {

    public static String binarySearchRecursion(int[] array, int elementToFind, int startIndex, int endIndex) {

        int mid = (endIndex + startIndex) / 2;

        if(elementToFind == array[mid]) {
            return "element found at index: " + mid;
        }

        // this can be written differently as well
        if(startIndex == endIndex && elementToFind != array[mid]) {
            return "element not found";
        }

        if(elementToFind > array[mid]) {
            return binarySearchRecursion(array, elementToFind, mid + 1, endIndex);
        }
        else if(elementToFind < array[mid]){
            return binarySearchRecursion(array, elementToFind, startIndex, mid - 1);
        }

        return "element not found";
    }

    public static String binarySearchIterative(int[] array, int elementToFind, int startIndex, int endIndex) {

        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex)/2;

            if(array[mid] == elementToFind) {
                return "Element found at index: " + mid;
            }

            if(elementToFind > array[mid]) {
                startIndex = mid + 1;
            }
            else if(elementToFind < array[mid]) {
                endIndex = mid -1;
            }
        }

        return "Element Not found";
    }

    public static void main(String[] args) {
        int[] array = {90,91,92,93,94,95,96,97,98};

        System.out.println(binarySearchRecursion(array, 97, 0, array.length -1));

        System.out.println(binarySearchRecursion(array, 990, 0, array.length -1));

        System.out.println(binarySearchIterative(array, 97, 0, array.length -1));
        System.out.println(binarySearchIterative(array, 990, 0, array.length -1));
    }
}
