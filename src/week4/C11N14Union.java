
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C11N14Union extends ArrayList {
    public static ArrayList<Integer> union(ArrayList<Integer> list1, 
            ArrayList<Integer> list2) {
        for(int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        return list1;
    }

    public static String stringFormatter(ArrayList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            sb.append(" ");
        }
        return sb.toString();
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        System.out.print("Enter five integers for list1: ");
        for(int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }
        System.out.print("Enter five integers for list2: ");
        for(int j = 0; j < 5; j++) {
            list2.add(sc.nextInt());
        }
        System.out.println("The combined list is " + stringFormatter(union(list1, list2)));
    }
}
