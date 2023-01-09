/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacommand;

/**
 *
 * @author Onder Eyecioglu
 */
// Komutları nesneler haline getirelecek olan sınıf.
// UML diyagramındaki Receiver sınıfına denk gelmektedir.
class StockManager {
    public String _name;
    public int _quantity;

    public StockManager(String name, int quantity) {
        _name = name;
        _quantity = quantity;
    }
    public void buy() {
        String message = String.format("Stock: %s, %s bought!", _name, _quantity);
        System.out.println(message);
    }
    public void sell() {
        String message = String.format("Stock: %s, %s sold!", _name, _quantity);
        System.out.println(message);
    }
    
}
