/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacommand;

/**
 *
 * @author Onder Eyecioglu
 */
public class store implements IOrderCommand {
    private StockManager _stockManager;
    public store(StockManager stockManager) {
        _stockManager = stockManager;
    }
     public void execute() {
        System.out.println(_stockManager._quantity+" pcs "+_stockManager._name+" are stored in storege");
    }
}
