
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C11N4MaxElement {
    public static Integer max(ArrayList<Integer> list) {
        if(list.isEmpty()) return null;
        int maxIndex = 0;
        for(int i = 0; i < list.size(); i++) {
            if(maxIndex < list.get(i)) {
                maxIndex = i;
            }
        }
        return list.get(maxIndex);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers ending with 0: ");
        String nums = sc.next();
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < nums.length(); i++) {
            int c = Character.getNumericValue(nums.charAt(i));
            Integer n = new Integer(c);
            list.add(n);
        }
        System.out.println("The max number is " + max(list));
        
    }
}
