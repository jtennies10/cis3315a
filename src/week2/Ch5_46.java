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
public class Ch5_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String s = sc.nextLine();
        for(int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println("");
    }
}
