/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

 

public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ders[] D=new ders[3];
        D[0]=new ders("Fizik",123,3);
        D[1]=new ders("NYP",234,65);
        D[2]=new ders("Mat",456,3);
        asistan ast1;
        ast1 = new asistan("Ahmet",567,10,"Dr",D);
        ast1.yaz();
        System.out.printf("\nKredi:%d\n",ast1.dersler[1].Kredi);
    }
    
}
