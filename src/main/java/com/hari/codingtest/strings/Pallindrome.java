package com.hari.codingtest.strings;

public class Pallindrome {

    private static boolean checkPallindrome(String string) {
        int low = 0, high = string.length()-1;

        while (low < high) {
            if(string.charAt(low) != string.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "malayalam"; // abbcdbba - Not pallindrome
        if(checkPallindrome(str)) {
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not Pallindrome");
        }
    }

}
