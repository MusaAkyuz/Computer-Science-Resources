/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaabstractfactory;

/**
 *
 * @author Onder Eyecioglu
 */
public class SedanCar extends Car
{
  public SedanCar(Location location)
  {
    super(CarType.LUXURY, location);
    construct();
  }
 
  @Override
  protected void construct() {
    System.out.println("Building luxury car");
    //add accessories
  }
}
