/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Joshua Tennies
 */
public class C12N19 {

    public static void main(String[] args) {
        String stringURL = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
        int count = 0;
        try {
            URL url = new URL(stringURL);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            String lineReader;
            while ((lineReader = bufferedReader.readLine()) != null) {
                for(int i = 1; i < lineReader.length() - 1; i++) {
                    if(lineReader.charAt(i) == ' ' && 
                            lineReader.charAt(i+1) != '-' && lineReader.charAt(i-1) != ' ' ) count++;
                }
                count++;
            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL.");
        } catch (IOException ex) {
            System.out.println("IO Errors: no such file");
        }
        System.out.println("Lincoln's Gettysburg Address contains " + count + " words.");
    }
}
