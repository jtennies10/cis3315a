/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class Ch5_49 {
    public static void main(String[] args) {
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
