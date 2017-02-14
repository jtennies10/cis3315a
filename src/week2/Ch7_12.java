
package week2;

/**
 * Reverses an array.
 *
 * @author jten10
 */
public class Ch7_12 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        display(x);
        reverse(x);
        display(x);
        int[] y = {1, 2, 3, 4, 5};
        display(y);
        reverse(y);
        display(y);
        
    }
    
    public static int[] reverse(int[] x) {
        int temp;
        for(int i = 0; i < x.length / 2; i++) {
            temp = x[i];
            x[i] = x[x.length - i - 1];
            x[x.length - i - 1] = temp;
        }
        return x;
    }
    
    public static void display(int[] x) {
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("");
    }
}
