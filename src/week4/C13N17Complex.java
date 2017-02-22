
package week4;

/**
 *
 * @author jten10
 */
public class C13N17Complex implements Cloneable {
    private double a; //real
    private double b; //imaginary

    public C13N17Complex(double a, double b) {
        this.a = a;
        this.b = b;
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
    
    public C13N17Complex add(C13N17Complex c) {
        return new C13N17Complex((a+c.getA()), (b+c.getB()));
    }
    
    public C13N17Complex subtract(C13N17Complex c) {
        return new C13N17Complex(a - c.getA(), b - c.getB());
    }
}

class Test {
    public static void main(String[] args) {
        
    }
}
