package org.example.services;
import org.example.Accounts.BaseAccount;
import org.example.Storages.AccountStorage;
import org.example.cards.PaymentCard;

public class Balancemanager {
        Balancecheck Kontrola = new Balancecheck();
        Logger logger = new Logger();
        public boolean cardTransaction(AccountStorage accountStorage, PaymentCard paymentcard, double amount, boolean action) {
            BaseAccount account = accountStorage.findAccountByPaymentCard(paymentcard);
            if (account == null) return false;

            if (action) {
                return addBalance(account, amount) ;
            }
            else
            {
                return decreaseBalance(account, amount) ;
            }

        }
        public boolean addBalance(BaseAccount account, double amount) {
            if(Kontrola.depositcheck(account,amount) == true)
                {
                account.setBalance(account.getBalance()+amount);
                logger.Success();
                return  true;
                }
                logger.Error();
                return   false;
        }


        public boolean decreaseBalance(BaseAccount account, double amount) {
            if(Kontrola.withdrawcheck(account,amount) == true && account.getBalance()>amount)
            {
                account.setBalance(account.getBalance() - amount);
                logger.Success();
                return true;
            }
            logger.Error();
            return false;
        }
    }


