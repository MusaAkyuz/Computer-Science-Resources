/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastrategy;

/**
 *
 * @author Önder Eyecioğlu
 */
public class GooglePlusStrategy implements ISocialMediaStrategy {
  @Override
  public void connectTo(String friendName) 
  {
    System.out.println("Connecting with " + friendName + " through GooglePlus");
  }
}
