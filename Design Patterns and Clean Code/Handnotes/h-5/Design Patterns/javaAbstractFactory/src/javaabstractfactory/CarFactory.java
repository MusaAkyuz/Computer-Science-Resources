/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaabstractfactory;


public class CarFactory
{

   private CarFactory() {
    //Prevent instantiation
  }
 
  public static Car buildCar(CarType type, Location location )
  {
    Car car = null;
    //Location location = Location.ASIA; //Read location property somewhere from configuration
    //Use location specific car factory
    switch(location)
    {
      case USA:
        car = USACarFactory.buildCar(type);
        break;
      case ASIA:
        car = AsiaCarFactory.buildCar(type);
        break;
      default:
        car = DefaultCarFactory.buildCar(type);
    }
  return car;
  }
}
