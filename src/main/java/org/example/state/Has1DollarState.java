package org.example.state;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class Has1DollarState implements State {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        log.info("Inserted 1$ already!");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        log.info("Returning money...");
        vendingMachine.doReturnMoney();
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {

        log.info("Releasing product");

        if (vendingMachine.getChocolateStock() > 1) {
            vendingMachine.doReleaseProduct();
            vendingMachine.setCurrentState(vendingMachine.getIdleState());
        } else {
            vendingMachine.doReleaseProduct();
            vendingMachine.setCurrentState(vendingMachine.getOutOfStockState());
        }
    }

    @Override
    public void onEnterState(VendingMachine vendingMachine) {
        log.info("Vending Machine in {}", this);
    }
}
