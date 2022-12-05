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
public class personel {
     protected String adi;
    protected int sicil;
    protected int saat;
    protected int maas;
    personel(int h){// constructor
        saat=h;
        maas=maasHesap();
    }
    personel(String a, int h){// constructor
        this(h);
        adi=a;   
    }
    personel(String a,int s, int h){// constructor
        this(a,h);
        sicil=s;
    }
     protected int maasHesap(){
        return 10*saat;
    }
    public void yaz(){
        System.out.printf("Adi:%s\t Sicil:%d\t Maas:%d\n",adi, sicil, maas);
    }
}
