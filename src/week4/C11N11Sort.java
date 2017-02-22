
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C11N11Sort {
    public static void sort(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size(); i++) {
                if(list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.print("Enter five integers separated by spaces: ");
        int one = sc.nextInt();
        list.add(one);
        int two = sc.nextInt();
        list.add(two);
        int three = sc.nextInt();
        list.add(three);
        int four = sc.nextInt();
        list.add(four);
        int five = sc.nextInt();
        list.add(five);
        sort(list);
        System.out.println(list.toString());
    }
}
