
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C11N12Sum {
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.print("Enter five numbers separated by spaces: ");
        double one = sc.nextDouble();
        list.add(one);
        double two = sc.nextDouble();
        list.add(two);
        double three = sc.nextDouble();
        list.add(three);
        double four = sc.nextDouble();
        list.add(four);
        double five = sc.nextDouble();
        list.add(five);
        System.out.println("The sum is: " + sum(list));
    }
}
