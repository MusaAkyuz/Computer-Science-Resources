/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadocexmp1;

/**
 *
 * @author Önder
 */
public class Point {
     private double x;
    private double y;
    /**
     * Verilen noktanin pozisyonlarını gosterir.
     * @param x x eksen degeri 
     * @param y y eksen degeri
     */
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    /**
     * Verilen Nokta ile A noktası arasındaki mesafeyei hesaplar.
     * @param A
     * @return double turunde mesafe doner
     */
    public double distance(Point A){
        return Math.hypot(this.x-A.x, this.y-A.y);
    }
}
