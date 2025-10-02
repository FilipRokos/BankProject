package org.example.services;
import org.example.Accounts.BaseAccount;

public class Balancemanager {
        Kontrola Kontrola = new Kontrola();
        public void addBalance(BaseAccount account, double amount) {
            if(Kontrola.kontrolavkladu(account,amount) == true)
                {
                account.setBalance(account.getBalance()+amount);
                }

        }

        public void decreaseBalance(BaseAccount account, double amount) {
            if(Kontrola.kontrolavyberu(account,amount) == true && account.getBalance()>amount)
            {
                account.setBalance(account.getBalance() - amount);
            }
        }
    }


