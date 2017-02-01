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
public class Ch7Review_1DArrays {
    public static void main(String[] args) {
        int[] x = reverse(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("");
        int[] array = reverse(new int[] {1, 2, 3, 4, 5});
        for(int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        
        System.out.println("");
        double[] y = {1.3, 2.4, 1.9, 0, 5.6, 8, 4, 7, 3.3, 9.7};
        selectionSort(y);
        for(int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }
    }
    
    /**
     * 7.12
     * @param x is the array to be reversed
     * @return the reversed array
     */
    public static int[] reverse(int[] x) {
        int temp;
        for(int i = 0; i < x.length / 2; i++) {
            temp = x[i];
            x[i] = x[x.length - i - 1];
            x[x.length - i - 1] = temp;
        }
        return x;
    }
    
    /**
     * 7.29
     * @param list is the array to be sorted 
     */
    public static void selectionSort(double[] list) {
        for(int i = list.length - 1; i >= 1; i--) {
            double currentMax = list[i];
            int currentMaxIndex = i;
            
            for(int j = i - 1; j >= 0; j--) {
                if(currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            
            if(currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
