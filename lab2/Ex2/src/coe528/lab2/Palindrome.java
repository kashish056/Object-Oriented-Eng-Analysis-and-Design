/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab2;

/**
 *
 * @author Kashish
 */
public class Palindrome {
    
    
   public static boolean Palindrome(String a) {
    if (a == null || a.length() == 0) {
        System.out.println("Error: Input string cannot be null or empty");
        return false;
    }

    // Rest of the code remains the same
    String input = a.replaceAll("\\s", "").toLowerCase();
    int left = 0;
    int right = input.length() - 1;

    while (left < right) {
        if (input.charAt(left) != input.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}

// Main method for testing
public static void main(String[] args) {
    if (args.length == 1) {
        if (args[0].equals("1"))
            System.out.println(Palindrome(null)); // Should throw IllegalArgumentException
        else if (args[0].equals("2"))
            System.out.println(Palindrome("")); // Should return false
        else if (args[0].equals("3"))
            System.out.println(Palindrome("deed")); // Should return true
        else if (args[0].equals("4"))
            System.out.println(Palindrome("abcd")); // Should return false
    }
}
}
