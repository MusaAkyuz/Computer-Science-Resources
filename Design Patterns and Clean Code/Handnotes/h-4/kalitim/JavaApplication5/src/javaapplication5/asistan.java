/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Pc Lab 03 Hoca
 */
public class asistan extends akademik {
    public ders[] dersler=new ders[3];
    asistan(String a,int s, int h, String u, ders[] d  ){
       super(a,s,h,u);
       dersler=d;
    }
    public void yaz(){
        super.yaz();
        System.out.printf("\nDersler:%s",dersler[0].Adi);
        System.out.printf("\nDersler:%s",dersler[1].Adi);
        System.out.printf("\nDersler:%s",dersler[2].Adi);
    }
}
