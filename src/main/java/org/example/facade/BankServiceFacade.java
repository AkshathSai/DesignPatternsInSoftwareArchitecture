package org.example.facade;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Hashtable;

@Slf4j
public class BankServiceFacade {

    private Hashtable<Integer, IAccount> bankAccounts;

    public BankServiceFacade() {
        this.bankAccounts = new Hashtable<>();
    }

    public int createNewAccount(String type, BigDecimal initAmount) {

        IAccount newAccount = null;

        switch (type) {

            case "checking":
                newAccount = new Checking(initAmount);
                log.info("{}", newAccount);
                break;
            case "savings":
                newAccount = new Savings(initAmount);
                log.info("{}", newAccount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                log.info("{}", newAccount);
                break;
            default:
                log.info("Invalid account type {}", type);
                break;
        }

        if (newAccount != null) {
            bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return -1;
    }

    public void transferMoney(Integer from, Integer to, BigDecimal amount) {
        IAccount fromAccount = bankAccounts.get(from);
        IAccount toAccount = bankAccounts.get(to);

        fromAccount.transfer(toAccount, amount);
        log.info("{}", fromAccount);
        log.info("{}", toAccount);
    }

}
