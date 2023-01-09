/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacommand;

// Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir.
// Command (IOrderCommand) arayüzünü uygular.
// UML diyagramındaki ConcreteCommand sınıfına denk gelmektedir.
class SellStock implements IOrderCommand {
    private StockManager _stockManager;

    public SellStock(StockManager stockManager) {
        _stockManager = stockManager;
    }

    public void execute() {
        _stockManager.sell();
    }
}
