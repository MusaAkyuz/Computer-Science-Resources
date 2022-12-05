/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaabstractfactory;


public class AsiaCarFactory
{
   public static Car buildCar(CarType model)
  {
    Car car = null;
    switch (model)
    {
      case SMALL:
      car = new SmallCar(Location.ASIA);
      break;
 
      case SEDAN:
      car = new SedanCar(Location.ASIA);
      break;
 
      case LUXURY:
      car = new LuxuryCar(Location.ASIA);
      break;
 
      default:
      //throw some exception
      break;
    }
    return car;
  }
}
