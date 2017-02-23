
package week4;

import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C13N17 implements Cloneable {
    private double a; //real
    private double b; //imaginary

    public C13N17(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public C13N17(double a) {
        this.a = a;
        this.b = 0;
    }
    
    public C13N17() {
        this.a = 0;
        this.b = 0;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public C13N17 add(C13N17 c) {
        return new C13N17((a+c.getA()), (b+c.getB()));
    }
    
    public C13N17 subtract(C13N17 c) {
        return new C13N17(a - c.getA(), b - c.getB());
    }
    
    public C13N17 multiply(C13N17 c) {
        return new C13N17(((a * c.getA()) - (b * c.getB())), ((b * c.getA()) + (a * c.getB())));
    }
    
    public C13N17 divide(C13N17 c) {
        return new C13N17(((a*c.getA() + b*c.getB())/(c.getA()*c.getA() +c.getB()*c.getB())),
                ((b*c.getA() - a*c.getB())/(c.getA()*c.getA() +c.getB()*c.getB())));
    }
    
    public double absoluteValue() {
        return Math.sqrt(a*a + b*b);
    }

    @Override
    public String toString() {
         if(b == 0) return a + "";
         return String.format("(%.4f + %.1fi)", a, b);
    }
    
    
}

class Test {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double c1p1 = sc.nextDouble();
        double c1p2 = sc.nextDouble();
        C13N17 complexOne = new C13N17(c1p1, c1p2);
        System.out.print("Enter the second complex number: ");
        double c2p1 = sc.nextDouble();
        double c2p2 = sc.nextDouble();
        C13N17 complexTwo = new C13N17(c2p1, c2p2);
        System.out.println(complexOne.toString() + " + " + complexTwo.toString()
                + " = " + complexOne.add(complexTwo));
        System.out.println(complexOne.toString() + " - " + complexTwo.toString()
                + " = " + complexOne.subtract(complexTwo));
        System.out.println(complexOne.toString() + " * " + complexTwo.toString()
                + " = " + complexOne.multiply(complexTwo));
        System.out.println(complexOne.toString() + " / " + complexTwo.toString()
                + " = " + complexOne.divide(complexTwo));
        System.out.println("|" + complexOne.toString() + "| = " 
                + complexOne.absoluteValue());
        ;
        
        
    }
}
