/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
*JAVADOC icersisnde goruntulenmeyecek aciklama la
*/
//Javadoc ornegi
package javadoc2;
/**
 * @author Onder Eyecioglu
 * @version 1.2, 09.03.2022
 * @since 1.1
 */
/**
 *Javadoc dokumnatasyon ornegi olarak yazilmistir.
 * <p>Javadoc, <strong>JDK</strong> ile birlikte gelen bir araçtır ve <em>Java</em> kaynak kodundan <em>HTML</em> formatında Java kodu dokümantasyonu oluşturmak için kullanılır ve önceden tanımlanmış bir formatta dokümantasyon gerektirir.
 * Aşağıda,\/* \*\/ içindeki satırların Java çok satırlı yorumları olduğu basit bir örnek verilmiştir. Benzer şekilde, // öncesindeki satır Java tek satırlık yorumudur.</p>
 * <p><code>&lt;strong&gt;</code> gibi HTML etikenleri icerir</p>
 *
 * @see javadoc2.Point
 * @see javadoc2.JavaDoc2
 * @since 08.03.2022
 * @see <a href="https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html">Ayrintili bilgi ,icin</a> 
 */

public class JavaDoc2 {

    /**
     * @param args Komut Satiri argumanlari
     */
    public static void main(String[] args) {
          Point B=new Point(3,4);
          Point C=new Point(6,8);
          /***
           * @see B.getX() method cagrisi
           */
          System.out.println(B.getX());
          System.out.println(B.getY());
          System.out.println(B.distance(C));
          
    }
    
}
