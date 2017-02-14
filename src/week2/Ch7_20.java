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
public class Ch7_20 {
    public static void main(String[] args) {
        double[] y = {1.3, 2.4, 1.9, 0, 5.6, 8, 4, 7, 3.3, 9.7};
        display(y);
        selectionSort(y);
        display(y);
    }
    
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
    
    public static void display(double[] x) {
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("");
    }
}
