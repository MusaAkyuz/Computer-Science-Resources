/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javasingleton;

/**
 *
 * @author Onder Eyecioglu
 */
class MakeACaptain
{
    public int x;
    private static MakeACaptain _captain;
    //We make the constructor private to prevent the use of "new"
    private MakeACaptain() { 
        
    }
    public  MakeACaptain(int y) { 
        this.x=y;
    }
    public static MakeACaptain getCaptain(int y){
        
        if (_captain == null){ 
            _captain = new MakeACaptain(y);
            System.out.println("New Captain selected for our team");
            
        }else{
            System.out.print("You already have a Captain for your team.");
            System.out.println("Send him for the toss.");
            
        }
        return _captain;
    }
    //Yukarıdaki çözümde, singleton sınıfının bir nesnesi her zaman somutlaştırılır.
    private static class SingletonHelper{
//Nested class is referenced after getCaptain() is called
        private static final MakeACaptain _captain = new MakeACaptain();
    }
    public static MakeACaptain getCaptain1(){
        return SingletonHelper._captain;
    }
    /*Bu yöntemin senkronizasyon tekniğini ve istekli başlatmayı kullanması gerekmez. 
    Java'da singletonları uygulamak için standart yöntem olarak kabul edilir.*/
}


public class JavaSingleton {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        MakeACaptain c0=new MakeACaptain(20);
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        MakeACaptain c1 = MakeACaptain.getCaptain(10);
        System.out.println("Trying to make another captain for our team");
        MakeACaptain c2 = MakeACaptain.getCaptain(20);
         if (c0 == c1){
            System.out.println("c0 and c1 are same instance");
            System.out.println("c0.x="+c0.x+"\nc1.x="+c1.x);
        }else{
            System.out.println("c0 and c1 are not same instance");
            System.out.println("c0.x="+c0.x+"\nc1.x="+c1.x);
        }
        if (c1 == c2){
            System.out.println("c1 and c2 are same instance");
            System.out.println("c1.x="+c1.x+"\nc2.x="+c2.x);
        }
        if (c1.equals(c2)){
            System.out.println("c1 and c2 are equal instances");
        }
        c1.x=30;
        System.out.println("c1.x="+c1.x+"\nc2.x="+c2.x);
    }
    
}
