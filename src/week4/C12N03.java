
package week4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C12N03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] x = new int[100];
        for(int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt();
        }
        System.out.print("Enter an array index between 0 and 99: ");
        try {
            int index = sc.nextInt();
            System.out.println("The number is " + x[index]);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }
}
