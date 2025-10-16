package org.example.Accounts;

import org.example.people.BaseHuman;

public class BankAccount extends BankAccountWithPaymentCard {
    public BankAccount(String uuid, double balance, String accountNumber, BaseHuman owner) {
        super(uuid, balance, accountNumber, owner);
    }
}