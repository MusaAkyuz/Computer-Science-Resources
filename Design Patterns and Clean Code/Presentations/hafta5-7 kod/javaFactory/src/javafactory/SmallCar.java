/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafactory;

/**
 *
 * @author Önder Eyecioğlu
 */
public class SmallCar extends Car 
{
  SmallCar() {
    super(CarType.SMALL);
    construct();
  }
  @Override
  protected void construct() {
    System.out.println("Building small car");
    // add accessories
  }
}
