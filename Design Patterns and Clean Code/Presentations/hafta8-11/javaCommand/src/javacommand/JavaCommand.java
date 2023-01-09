/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacommand;

/**
 *
 * @author Onder Eyecioglu
 */
public class JavaCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StockManager stockManager = new StockManager("iPhone", 200);
        stockManager.buy();
        stockManager.sell();
       
        BuyStock buyStock = new BuyStock(stockManager);
        SellStock sellStock = new SellStock(stockManager);
        store s=new store(stockManager);
        StockController stockController = new StockController();

        stockController.takeOrder(buyStock);
        stockController.takeOrder(sellStock);
        stockController.takeOrder(s);
       stockController.placeOrders();
        // output:
        //  Stock: iPhone, 200 bought!
        //  Stock: iPhone, 200 sold!
        //  Stock: iPhone, 200 sold!
        System.out.println("*****");
        
        stockController.placeOrders();
        System.out.println("*****");
        //stockController.takeOrder(s);
        //stockController.placeOrders();
        
    }
    
}
