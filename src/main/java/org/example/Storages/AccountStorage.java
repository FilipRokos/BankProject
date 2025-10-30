package org.example.Storages;

import org.example.Accounts.BankAccountWithPaymentCard;
import org.example.Accounts.BaseAccount;
import org.example.cards.PaymentCard;

import java.util.ArrayList;
import java.util.List;

public class AccountStorage {
    private final List<BaseAccount> accounts;

    public AccountStorage() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BaseAccount account) {
        accounts.add(account);
    }

    public List<BaseAccount> getAccounts() {
        return accounts;
    }

    public BaseAccount findAccountByPaymentCard(PaymentCard card) {
        for (BaseAccount account : accounts) {
            if (account instanceof BankAccountWithPaymentCard bankAcc) {
                for (PaymentCard pc : bankAcc.getPaymentCards()) {
                    if (pc.getCardNumber().equals(card.getCardNumber())) {
                        return account;
                    }
                }
            }
        }
        return null;
    }


}
