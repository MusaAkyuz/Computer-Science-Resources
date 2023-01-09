/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaabstractfactory;

/**
 *
 * @author Onder Eyecioglu
 */
public class SmallCar extends Car {
    SmallCar( Location location) {
    super(CarType.SMALL, location);
    construct();
  }

    
  @Override
  protected void construct() {
    System.out.println("Building small car");
    // add accessories
  }
}
