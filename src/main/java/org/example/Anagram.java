package org.example;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1 = "CAT";
        String str2 = "ACT";
        String str3 = "ARMY";
        String str4 = "MARY";


        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str3 = str3.toLowerCase();
        str4 = str4.toLowerCase();

        // check if length is same
        if(str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
        if(str3.length() == str4.length()) {

            // convert strings to char array
            char[] charArray3 = str3.toCharArray();
            char[] charArray4 = str4.toCharArray();

            // sort the char array
            Arrays.sort(charArray3);
            Arrays.sort(charArray4);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray3, charArray4);

            if(result) {
                System.out.println(str3 + " and " + str4 + " are anagram.");
            }
            else {
                System.out.println(str3 + " and " + str4 + " are not anagram.");
            }
        }
        else {
            System.out.println(str3 + " and " + str4 + " are not anagram.");
        }

    }
}

