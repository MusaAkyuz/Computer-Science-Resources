/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacommand;

import java.util.ArrayList;
import java.util.List;

// Command (IOrderCommand) arayüzünü uygulayan sınıf referansını tutar.
// Metotun ne zaman çağrılacağını belirtir.
// UML diyagramındaki Invoker sınıfına denk gelmektedir.
class StockController {
    private List<IOrderCommand> _orderCommands;

    public StockController() {
        _orderCommands = new ArrayList<>();
    }

    public void takeOrder(IOrderCommand command) {
        _orderCommands.add(command);
    }

    public void placeOrders() {
        for (IOrderCommand command : _orderCommands) {
            command.execute();
        }

        _orderCommands.clear();
    }
}