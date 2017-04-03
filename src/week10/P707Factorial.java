
package week10;

import java.util.Scanner;

/**
 *
 * @author Joshua Tennies
 */
public class P707Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to see its factorial: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    
    public static long factorial(int n) {
        long fac = 1;
        if(n > 1) {
            fac = n * factorial(n-1);
        }
        return fac;
    }
}
