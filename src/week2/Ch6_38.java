/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author jten10
 */
public class Ch6_38 {

    public static void main(String[] args) {
        printHundredUppercase();
        printHundredSingleDigits();
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
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
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(getRandomUpperCaseLetter());
            }
            System.out.println("");
        }
    }

    public static void printHundredSingleDigits() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(getRandomDigitCharacter());
            }
            System.out.println("");
        }
    }
}
