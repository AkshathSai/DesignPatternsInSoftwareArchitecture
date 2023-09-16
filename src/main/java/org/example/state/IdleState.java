package org.example.state;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class IdleState implements State {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        vendingMachine.setCurrentState(vendingMachine.getHas1DollarState());
        log.info("Received 1 Dollar");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        log.info("No money inserted!!");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        log.info("Required payment!!");
    }

    @Override
    public void onEnterState(VendingMachine vendingMachine) {
        log.info("Vending Machine in {}", this);
    }
}
