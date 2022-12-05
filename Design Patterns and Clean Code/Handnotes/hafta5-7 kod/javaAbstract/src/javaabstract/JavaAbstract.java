/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaabstract;

/**
 *
 * @author Onder Eyecioglu
 */

abstract class Bank{ 
    int x;
    abstract int getRateOfInterest();    
}    
class SBI extends Bank{
    SBI(){
        this.x=100;
    }    
    int getRateOfInterest(){return 7;}    
}    
class PNB extends Bank{
    PNB(){ 
        this.x=200;
    }
    int getRateOfInterest(){return 8;}    
}  
public class JavaAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank b;  
        b=new SBI();  
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        System.out.println(b.x);
        b=new PNB();  
        System.out.println(b.x);
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %"); 
    }
    
}
