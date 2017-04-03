package week10;

import java.util.Scanner;

/**
 *
 * @author Joshua Tennies
 */
public class P710Fib {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int n = sc.nextInt();
        
        System.out.println("The Fibonacci number at index " + n + " is " + fib(n));
    }

    public static long fib(long index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }
}
