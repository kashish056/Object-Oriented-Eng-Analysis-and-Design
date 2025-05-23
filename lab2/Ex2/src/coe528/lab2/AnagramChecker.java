/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab2;

import java.util.Arrays;

/**
 *
 * @author janki
 */
public class AnagramChecker {
    
    

    /**
     * Determines whether two given strings are anagrams.
     *
     * Requires: str1 and str2 are not null.
     * Modifies: None.
     * Effects: Returns true if the strings are anagrams (case-insensitive and considering spaces),
     *          false otherwise.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return true if the strings are anagrams, false otherwise.
     */
   public static boolean areAnagrams(String str1, String str2) {
    if (str1 == null || str2 == null) {
        System.out.println("Error: Input strings cannot be null");
        return false;
    }

    String cleanedStr1 = str1.replaceAll("\\s", "").toLowerCase();
    String cleanedStr2 = str2.replaceAll("\\s", "").toLowerCase();

    return sortString(cleanedStr1).equals(sortString(cleanedStr2));
}


    // Helper method to sort characters in a string
    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    // Main method for testing
    public static void main(String[] args) {
        if (args.length == 2) {
            boolean result = areAnagrams(args[0], args[1]);
            System.out.println(result);
        }
    }
}

    

