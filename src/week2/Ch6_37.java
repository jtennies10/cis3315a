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
public class Ch6_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number and width to display it as: ");
        int number = sc.nextInt();
        int width = sc.nextInt();
        System.out.println(format(number, width));
    }
    
  
    public static String format(int number, int width) {
        String s = "" + number;
        if(s.length() < width) {
            int numZeros = width - s.length();
            for(int i = 0; i < numZeros; i++) {
                s = "0" + s;
            }
        }
        return s;
    }
}
