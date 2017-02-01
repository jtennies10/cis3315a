/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Joshua Tennies
 */
public class Ch5Review_Loops {
    public static void main(String[] args) {
        System.out.println(reverseString("AAABDIJ"));
        System.out.println(isbn());
        stringAnalyzer();
    }
    
    /**
     * 5.46
     * @param s is string to be reversed
     * @return reversed string
     */
    public static String reverseString(String s) {
        String reversed = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
    
    /**
     * 5.47
     * @return the isbn-13 
     */
    public static String isbn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbnTwelve = sc.nextLine();
        int[] x = new int[13];
        for(int i = 0; i < x.length - 1; i++) {
            x[i] = Character.getNumericValue(isbnTwelve.charAt(i));
        }
        long checksum = 10 - ((x[0] + 3*x[1] + x[2] + 3*x[3] + x[4] + 3*x[5] + 
                x[6] + 3*x[7] + x[8] + 3*x[9] + x[10] + 3*x[11]) % 10);
        if(checksum == 10) {
            return "The ISBN-13 number is " + isbnTwelve + 0;
        } else {
            return "The ISBN-13 number is " + isbnTwelve + checksum;
        }
    }
    
    /**
     * 5.49
     */
   public static void stringAnalyzer() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String userString = sc.nextLine().toLowerCase();
       int vowels = 0;
       int consonants = 0;
       for(int i = 0; i < userString.length(); i++) {
           char currentChar = userString.charAt(i);
           if(currentChar == 'a' ||currentChar == 'e' || currentChar == 'i' ||
                   currentChar == 'o' || currentChar == 'u') {
               vowels++;
           } else if(Character.isLetter(currentChar)) {
               consonants++;
           }
       }
       System.out.println("The number of vowels is " + vowels);
       System.out.println("The number of consonants is " + consonants);
   }
}
