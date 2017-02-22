/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author jten10
 */
public class C13N1Triangle extends GeometricObject {

    private double a;
    private double b;
    private double c;

    public C13N1Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public String toString() {
        return "area=" + getArea()
                + "\nperimeter=" + getPerimeter()
                + "\n" + super.toString();
    }

}

abstract class GeometricObject {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class C13N1Test {
    
}
