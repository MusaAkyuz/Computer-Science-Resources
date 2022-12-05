/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadoc2;

/**
 *Javadoc dokumnatasyon ornegi olarak yazilmistir.
 * <p>Javadoc, <strong>JDK</strong> ile birlikte gelen bir araçtır ve Java kaynak kodundan <em>HTML</em> formatında Java kodu dokümantasyonu oluşturmak için kullanılır ve önceden tanımlanmış bir formatta dokümantasyon gerektirir.
 * Aşağıda,\/* \*\/ içindeki satırların Java çok satırlı yorumları olduğu basit bir örnek verilmiştir. Benzer şekilde, // öncesindeki satır Java tek satırlık yorumudur.</p>
 * 
 * @author Onder Eyecioglu
 * @version 1.2, 09.03.2022
 * @see #Point(double , double )
 * @see Math class
 * @see javadoc2.JavaDoc2
 * @see java.awt.Point #Java standart class adresler
 * 
 */
public class Point {
    private double x;
    private double y;
    /**
     * Sinifin yapici metodu dur.
     * Verilen noktanin pozisyonlarını gosterir.
     * @param x x eksen degeri 
     * @param y y eksen degeri
     * @see #Point(double , double )
     */
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    /**
     * x degerini dondurur 
     * @return x 
     */
    public double getX(){
        return this.x;
    }
      /**
     * x degerini dondurur 
     * @return x 
     */
    public double getY(){
        return this.y;
    }
    /**
     * Verilen Nokta ile A noktası arasındaki mesafeyei hesaplar.
     * @param A referans mesafe nesnesi
     * @return double turunde mesafe doner
     * @see Math #math fonksiyonlari
     * 
     */
    
    public double distance(Point A){
        return Math.hypot(this.x-A.x, this.y-A.y);
    }
     /**
     * @serial Serialize PI {@value}
    */
    public final double PI = 3.14;
    public double cevre(Point A){
        return 2*PI*Math.hypot(A.x, A.y);
    }
}
