/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaabsfactory;

/**
 *
 * @author Önder Eyecioğlu
 */
public class CarFactory {
    public static Car buildCar(CarType model) {
    Car car = null;
    switch (model) {
    case SMALL:
      car = new SmallCar();
      break;
 
    case SEDAN:
      car = new SedanCar();
      break;
 
    case LUXURY:
      car = new LuxuryCar();
      break;
 
    default:
      // throw some exception
      break;
    }
    return car;
  }
}
