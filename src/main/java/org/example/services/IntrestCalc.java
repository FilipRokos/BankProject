package org.example.services;

import org.example.Accounts.SavingBankAccount;

public class IntrestCalc {
    public void increase(SavingBankAccount account)
    {
        account.setBalance(account.getBalance() + (account.getBalance() * ((account.interestRate / 100.0) / 12)));

    }
}
