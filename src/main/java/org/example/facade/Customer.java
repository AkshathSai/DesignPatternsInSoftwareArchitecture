package org.example.facade;

import java.math.BigDecimal;

public class Customer {

    public static void main(String[] args) {

        BankServiceFacade bankServiceFacade = new BankServiceFacade();
        int mySavingsAccount = bankServiceFacade.createNewAccount("savings", BigDecimal.valueOf(1000.00));
        int myInvestmentAccount = bankServiceFacade.createNewAccount("investment", BigDecimal.valueOf(500.00));

        bankServiceFacade.transferMoney(mySavingsAccount, myInvestmentAccount, BigDecimal.valueOf(300.00));
    }
}
