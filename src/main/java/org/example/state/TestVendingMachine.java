package org.example.state;

public class TestVendingMachine {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertDollar();
        vendingMachine.printCurrentState();
        vendingMachine.dispense();
        vendingMachine.printCurrentState();
        vendingMachine.insertDollar();
        vendingMachine.printCurrentState();
        vendingMachine.ejectMoney();
        vendingMachine.printCurrentState();
        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.printCurrentState();
        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.printCurrentState();
    }
}
