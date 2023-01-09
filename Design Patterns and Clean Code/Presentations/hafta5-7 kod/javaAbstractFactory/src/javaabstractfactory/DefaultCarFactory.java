/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaabstractfactory;

public class DefaultCarFactory
{
  public static Car buildCar(CarType model)
  {
    Car car = null;
    switch (model)
    {
      case SMALL:
      car = new SmallCar(Location.DEFAULT);
      break;
 
      case SEDAN:
      car = new SedanCar(Location.DEFAULT);
      break;
 
      case LUXURY:
      car = new LuxuryCar(Location.DEFAULT);
      break;
 
      default:
      //throw some exception
      break;
    }
    return car;
  }
}
