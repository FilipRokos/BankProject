package org.example.Storages;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Accounts.BankAccountWithPaymentCard;
import org.example.Accounts.BaseAccount;
import org.example.cards.PaymentCard;

import java.util.ArrayList;
import java.util.List;
@Singleton
public class AccountStorage {

    private final List<BaseAccount> accounts;
    @Inject
    public AccountStorage() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BaseAccount account) {
        System.out.println("adding account ");
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
