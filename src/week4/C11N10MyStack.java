
package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C11N10MyStack extends ArrayList{
    private ArrayList<Object> list = new ArrayList();
    
    public Object peek() {
        return list.get(size() - 1);
    }
    
    public Object pop() {
        Object o = list.get(size() - 1);
        list.remove(size() - 1);
        return o;
    }
    
    public void push(Object o) {
        list.add(o);
    }
    
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
    
    
}

class MyStackTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C11N10MyStack stack = new C11N10MyStack();
        System.out.println("Enter five strings");
        System.out.print("String one: ");
        String one = sc.nextLine();
        stack.push(one);
        System.out.print("String two: ");
        String two = sc.nextLine();
        stack.push(two);
        System.out.print("String three: ");
        String three = sc.nextLine();
        stack.push(three);
        System.out.print("String four: ");
        String four = sc.nextLine();
        stack.push(four);
        System.out.print("String five: ");
        String five = sc.nextLine();
        stack.push(five);
        for(int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}
