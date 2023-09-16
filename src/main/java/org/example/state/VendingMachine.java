package org.example.state;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class VendingMachine {

    private State currentState;
    private Integer chocolateStock = 2; // Number of chocolates available in Vending Machine

    public State getIdleState() {
        log.info("In Idle State...");
        this.currentState = new IdleState();
        return currentState;
    }

    public State getHas1DollarState() {
        log.info("In Has $1 State...");
        this.currentState = new Has1DollarState();
        return currentState;
    }

    public State getOutOfStockState() {
        log.info("In Out Of Stock State...");
        this.currentState = new OutOfStockState();
        return currentState;
    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public void printCurrentState() {
        currentState.onEnterState(this);
    }

    public void doReleaseProduct() {
        chocolateStock--;
        log.info("Released Chocolate, go merry way!");
        log.debug("Stock left {}" , chocolateStock);
    }

    public void doReturnMoney() {
        log.info("Returned $1");
    }

    /**
     * Since, default State of Vending Machine is Idle
     */
    public VendingMachine() {
        this.currentState = getIdleState();
    }
}
