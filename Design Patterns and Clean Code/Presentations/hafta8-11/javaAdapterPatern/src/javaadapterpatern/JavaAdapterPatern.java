package javaadapterpatern;
import java.util.*;
/**
 * @author Onder Eyecioglu
 */
class Rect{
    public double l;
    public double w;
    public Rect(double x, double y){
        this.l=x;
        this.w=y;
    }
}
class Triangle{
    public double b;//base
    public double h;//height
    public Triangle(double b, double h){
        this.b = b;
        this.h = h;
    }
}
class squere{
    public double x;
    public squere(double a){
        this.x=a;
    }
}
/*Calculator can calculate the area of a rectangle. To calculate the area we need a
Rectangle input.*/
class Calculator{ 
    Rect rectangle;
    public double getArea(Rect r){
        rectangle=r;
        System.out.println("Rect. method... ");
        return rectangle.l * rectangle.w;
    }
}
/*Calculate the area of a Triangle using CalculatorAdapter. Please note here: this time our
input is a Triangle.*/
class CalculatorAdapter{
    Calculator calculator;
    Triangle triangle;
    squere s;
    Rect rr;
    public double getArea(Triangle t){
        calculator = new Calculator();
        triangle=t;
        Rect r = new Rect(triangle.b,0.5*triangle.h );
        //Area of Triangle=0.5*base*height
        //r.l = triangle.b;
        //r.w = 0.5*triangle.h;
        return calculator.getArea(r);
    }
    public double getArea(squere t){
        calculator = new Calculator();
        s=t;
         
        Rect r = new Rect(s.x,s.x );
        return calculator.getArea(r);
    }
    public double getArea(Rect t){
        calculator = new Calculator();
        rr=t;
         
        Rect r = new Rect(rr.l,rr.w );
        return calculator.getArea(r);
    }
}
public class JavaAdapterPatern {

    public static void main(String[] args) {
        
        Rect r1=new Rect(3.,5.);
        Calculator c1=new Calculator();
        
        Triangle t = new Triangle(20,10);
        ///System.out.println("Area of the rect.:"+c1.getArea(t));
        System.out.println("Area of the rect.:"+c1.getArea(r1));
        System.out.println("***Adapter Pattern Demo***");
        CalculatorAdapter cal=new CalculatorAdapter();
               
        System.out.println("\nAdapter Pattern Example\n");
        System.out.println("Area of Triangle is :" + cal.getArea(t));
        squere s1=new squere(5.);
        System.out.println("Area of Triangle is :" + cal.getArea(s1));
        System.out.println("Area of Rect. is :" + cal.getArea(r1));
    }
    
}
