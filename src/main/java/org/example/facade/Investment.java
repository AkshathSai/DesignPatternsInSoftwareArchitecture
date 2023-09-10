package org.example.facade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Investment implements IAccount {

    private BigDecimal balance;

    public Investment(BigDecimal initAmount) {
        this.balance = initAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.balance = balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        this.balance = balance.subtract(amount);
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        toAccount.deposit(amount);
        withdraw(amount);
    }

    @Override
    public int getAccountNumber() {
        return hashCode();
    }
}
