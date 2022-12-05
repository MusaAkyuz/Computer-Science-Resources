/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaclasstypecasting;

/**
 *
 * @author Onder Eyecioglu
 */
public class JavaClassTypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Implicit upcasting in Java (polymorphism)
        parent obj = new child(10,20);
        // Calling the show() method to execute
        obj.show();
        
        //Implicit Downcasting (Error)
        /*child obj2=new parent(10); //compile time error
        obj2.show();*/
        
        //Explicit Downcasting 
        parent obj1=new child(10,20);
        System.out.println(obj1 instanceof child);
        System.out.println(obj1 instanceof parent);
        if(obj1 instanceof parent){
            child obj2=(child)obj1;         
            obj2.show();
        }
       /*  child obj3=(child)(new parent(10));
        obj3.show();*/
        
    }
    
}
