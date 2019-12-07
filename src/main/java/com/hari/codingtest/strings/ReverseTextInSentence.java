package com.hari.codingtest.strings;

import java.util.Stack;

/*  https://www.techiedelight.com/reverse-text-without-reversing-individual-words/
    Given a line of text, reverse the text without reversing the individual words :
    Ex:
    Input:
         I am passionate about preparing for technical interview
    Output:
        interview technical for preparing about passionate am I
    Solution: Put individual words in the string on a stack and pop them and print
 */
public class ReverseTextInSentence {

    // This one has o(n) in time and on(n) in space complexity - we can do better in space with next solution
    private static void reverseSentence(String sentence) {

        Stack<String> stringStack = new Stack();
        int startingIndex = 0;

        for(int i=0;i< sentence.length();i++) {
            if(sentence.charAt(i) == ' ' || i == sentence.length() -1) {
                String word = sentence.substring(startingIndex, i+1);
                stringStack.push(word.trim());
                startingIndex = i+1;
            }
        }

        while(!stringStack.empty()) {
            System.out.println(stringStack.pop());
        }
    }

    /* ANOTHER SOLUTION :
       REVERSE INDIVIDUAL WORD AND REVERSE THE ENTIRE STRING
      */
    private static void reverseSentenceBetterSol(String sentence) {

    }


    public static void main(String[] args) {
        String sentence = "I love learning problem solving";
        reverseSentence(sentence);
    }
}
