/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javastrategy;


/**
 *
 * @author Önder Eyecioğlu
 */
public class JavaStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating social Media Connect Object for connecting with friend by
        // any social media strategy.
        SocialMediaContext context = new SocialMediaContext();
 
         // Setting Facebook strategy.
        context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Lokesh");
        System.out.println("====================");
 
       // Setting GooglePlus strategy.
        context.setSocialmediaStrategy(new GooglePlusStrategy());
        context.connect("Lokesh");
 
        System.out.println("====================");
 
    }
    
}
