
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C11N04MaxElement {
    public static Integer max(ArrayList<Integer> list) {
        if(list.isEmpty()) return null;
        int maxIndex = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(maxIndex < list.get(i)) {
                maxIndex = list.get(i);
            }
        }
        return maxIndex;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number(end with 0): ");
        ArrayList<Integer> list = new ArrayList();
        while(sc.hasNext()) {
            int num = Integer.parseInt(sc.nextLine());
            if(num == 0) break;
            list.add(num);
            System.out.print("Enter a number (end with 0): ");
        }
        System.out.println("The max number is " + max(list));
    }
}
