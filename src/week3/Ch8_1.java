/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author jten10
 */
public class Ch8_1 {
    public static void main(String[] args) {
        double matrix[][] = {
            {1.5, 2, 3, 4},
            {5.5, 6, 7, 8},
            {9.5, 1, 3 ,1}
        };
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 0));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 1));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 2));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 3));
    }
    
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for(int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
}