/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclasstypecasting;

/**
 *
 * @author Onder Eyecioglu
 */
public class child extends parent {
    public int c;
    public child(int x, int y) {
        super(x);
        this.c=y;
    }
    @Override
    void show()
    {
    System.out.println("Child show method is called:"+this.p+","+this.c);
    }
    
}
