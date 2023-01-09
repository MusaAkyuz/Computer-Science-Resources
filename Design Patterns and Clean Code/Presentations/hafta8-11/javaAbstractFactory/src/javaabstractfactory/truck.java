/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaabstractfactory;

/**
 *
 * @author Onder Eyecioglu
 */
public class truck extends Car{
    truck(Location location){
        super(CarType.SMALL, location);
    construct();
    }    

    
  @Override
  protected void construct() {
    System.out.println("Building small car");
    
    // add accessories
  }
    public void capacity(){
    
     System.out.println("Load Capacity of the truck is 20ton ");
    }
}
