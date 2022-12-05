/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaabstractfactory;

/**
 *
 * @author Onder Eyecioglu
 */
public class JavaAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL, Location.USA));
        System.out.println(CarFactory.buildCar(CarType.SEDAN, Location.ASIA));
        System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
    }
    
}
