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
public class Ch5_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbnTwelve = sc.nextLine();
        
        if(isbnTwelve.length() == 12) {
            int sum = 0;
            int checksum = 0;
            for(int i = 1; i <= 12 - 1; i++) {
                if(i % 2 == 0) {
                    sum += 3 * Integer.parseInt(isbnTwelve.substring(i - 1, i));
                } else {
                    sum += Integer.parseInt(isbnTwelve.substring(i - 1, i));
                }
            }
            checksum = 10 - sum % 10;
            if(checksum == 10) {
                checksum = 0;
            } 
            System.out.println("The ISBN number is " + isbnTwelve + checksum);
        } else {
            System.out.println(isbnTwelve + " is invalid input");
        }
    }
}
