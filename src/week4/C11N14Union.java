
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C11N14Union {
    public static ArrayList<Integer> union(ArrayList<Integer> list1, 
            ArrayList<Integer> list2) {
        for(int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        return list1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
