package org.example.state;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class OutOfStockState implements State {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        log.info("Ah! We're out of stock pls come back later, sorry for the inconvenience :(");
        vendingMachine.doReturnMoney();
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        log.info("No money to return");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        log.info("payment required");
    }

    @Override
    public void onEnterState(VendingMachine vendingMachine) {
        log.info("Vending Machine in {}", this);
    }
}
