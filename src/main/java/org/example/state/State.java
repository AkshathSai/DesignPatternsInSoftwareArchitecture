package org.example.state;

public interface State {

    void insertDollar(VendingMachine vendingMachine);
    void ejectMoney(VendingMachine vendingMachine);
    void dispense(VendingMachine vendingMachine);
    void onEnterState(VendingMachine vendingMachine);

}
