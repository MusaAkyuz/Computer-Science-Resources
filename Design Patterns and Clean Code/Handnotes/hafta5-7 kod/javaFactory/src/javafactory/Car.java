/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafactory;

/**
 *
 * @author Önder Eyecioğlu
 */
public abstract  class Car {
    public Car(CarType model) 
    {
        this.model = model;
        arrangeParts();
    }
    private void arrangeParts() {
    // Do one time processing here
    }
  // Do subclass level processing in this method
    protected abstract void construct();
    private CarType model = null;
    public CarType getModel() {
        return model;
    }
    public void setModel(CarType model) {
        this.model = model;
    }
}
