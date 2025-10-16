package org.example.services;
import org.example.Accounts.BaseAccount;
import org.example.Storages.AccountStorage;
import org.example.cards.PaymentCard;

public class Balancemanager {
        Kontrola Kontrola = new Kontrola();
        public boolean cardTransaction(AccountStorage accountStorage, PaymentCard paymentcard, double amount, boolean action) {
            BaseAccount account = accountStorage.findAccountByPaymentCard(paymentcard);
            if (account == null) return false;

            if (action) {
                 return addBalance(account, amount);
            }
            else
            {
                return decreaseBalance(account, amount) ;
            }

        }
        public boolean addBalance(BaseAccount account, double amount) {
            if(Kontrola.kontrolavkladu(account,amount) == true)
                {
                account.setBalance(account.getBalance()+amount);
                return  true;
                }
                return   false;
        }


        public boolean decreaseBalance(BaseAccount account, double amount) {
            if(Kontrola.kontrolavyberu(account,amount) == true && account.getBalance()>amount)
            {
                account.setBalance(account.getBalance() - amount);
                return true;
            }
            return false;
        }
    }


