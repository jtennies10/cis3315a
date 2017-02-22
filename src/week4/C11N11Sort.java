
package week4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C11N11Sort {
    public static void sort(ArrayList<Integer> list) {
        list.sort(Comparator.naturalOrder());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.print("Enter five integers separated by spaces: ");
        for(int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        sort(list);
        System.out.println("Sorted list is " + list.toString());
    }
}
