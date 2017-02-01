/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author Joshua Tennies
 */
public class Ch6Review_Methods {
 
    public static void main(String[] args) {
        System.out.println(format(4256, 5));
        System.out.println(format(300, 8));
        System.out.println(format(21, 1));
        System.out.println(format(34, 5));
        System.out.println(format(34, 4));
        
        printHundredUppercase();
        printHundredSingleDigits();
    }
    
    /**
     * 6.37
     * @param number the number that comes at the end of the String
     * @param width the number of digits in the String
     * @return the formatted number in String form
     */
    public static String format(int number, int width) {
        int numDigits = 0;
        int numCheck = number;
        while(!(numCheck < 10)) {
            numCheck /= 10;
            numDigits++;
        }
        if(width - numDigits < 0) return "" + number;
        else {
            String result = "";
            for(int i = 1; i < width - numDigits; i++) {
                result += 0;
            }
            result += number;
            return result;
        }
    }
     
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
    
    public static void printHundredUppercase() {
        for(int i = 1; i <= 100; i++) {
            System.out.print(getRandomUpperCaseLetter());
            if(i % 10 == 0) {
                System.out.println("");
            }
        }
    }
    
    public static void printHundredSingleDigits() {
        for(int i = 1; i <= 100; i++) {
            System.out.print(getRandomDigitCharacter() + " ");
            if(i % 10 == 0) {
                System.out.println("");
            }
        }
    }
   
}
