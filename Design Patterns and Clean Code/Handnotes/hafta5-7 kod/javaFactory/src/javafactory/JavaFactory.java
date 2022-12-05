/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafactory;

/**
 *
 * @author Önder Eyecioğlu
 */
public class JavaFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car c=CarFactory.buildCar(CarType.SMALL);
        System.out.println("Model:"+c.getModel());
        Car c1=CarFactory.buildCar(CarType.SEDAN);
        System.out.println("Model:"+c1.getModel());
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
    
}
