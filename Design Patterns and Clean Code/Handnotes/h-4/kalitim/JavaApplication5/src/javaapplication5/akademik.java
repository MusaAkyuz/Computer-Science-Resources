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
public class akademik extends personel {
    protected String unvan;
    akademik(String a,int s, int h, String u ){
        super(a,s,h);
        unvan=u;
        
    }
    public void yaz(){
        super.yaz();
        System.out.printf("Unvan:%s",unvan);
    }
    
}