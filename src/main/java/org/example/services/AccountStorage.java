package org.example.services;

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

    public BaseAccount findAccountByCard(PaymentCard card) {
        for (BaseAccount ac : accounts) {
            if (ac instanceof BankAccountWithPaymentCard bankAcc) {
                for (PaymentCard p : bankAcc.getPaymentCards()) {
                    if (p.getCardNumber().equals(card.getCardNumber())) {
                        return ac;
                    }
                }
            }
        }
        return null;
    }


}
