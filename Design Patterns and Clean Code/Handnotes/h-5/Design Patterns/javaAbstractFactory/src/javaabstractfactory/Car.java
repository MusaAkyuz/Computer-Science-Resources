/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaabstractfactory;

public abstract class Car {
 
  public Car(CarType model, Location location){
    this.model = model;
    this.location = location;
  }
 
  protected abstract void construct();
 
  private CarType model = null;
  private Location location = null;
 
  //getters and setters
 
  @Override
  public String toString() {
    return "Model- "+model + " built in "+location;
  }
}
