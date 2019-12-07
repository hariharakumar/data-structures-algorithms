package com.hari.codingtest.strings;

import java.util.Stack;

public class ReverseString {

    // This will take o(n) space thats why use non stack approach
    private static void reverseWithStack(String inputString) {
        Stack<Character> stack = new Stack<>();

        // push every character of the given String into the stack
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        // pop characters from the stack until it is empty
        while (!stack.empty()) {
            // assign each popped character back to the input String
            System.out.println(stack.pop());
        }
    }

    private static void reverseString(char[] c) {
        // start with two end points of the given String
        int begin = 0;
        int end = c.length - 1;

        // do till two end-points intersect
        while (begin < end) {
            swap(c, begin++, end--);
        }
    }

    private static void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void main(String[] args) {
        String string = "hello";
        String string1 = "whatsup";

        reverseWithStack(string);

        reverseString(string1.toCharArray());
    }
}
