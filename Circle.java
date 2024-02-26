/**
 * project: Circle
 * programmer: Tosia Bednarz
 * date: February 26th, 2024
 * program: Circle.java
 ***/

public class Circle {
    public static void main(String[]args){
        double radius=4.28;
        double circumference=2*radius*Math.PI;
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("The area of the circle is " + area);
        System.out.println("The circumference of the circle is " + circumference);
    }
    
}
