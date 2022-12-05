/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafactory;

/**
 *
 * @author Önder Eyecioğlu
 */
public class LuxuryCar extends Car {
  LuxuryCar() {
    super(CarType.LUXURY);
    construct();
  }
  @Override
  protected void construct() 
  {
    System.out.println("Building luxury car");
    // add accessories
  }
}
