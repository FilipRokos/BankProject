package org.example;

import org.example.Storages.AccountStorage;
import org.example.cards.*;
import org.example.factories.BankAccountFactorie;
import org.example.seriliatition.AccountOwnerJsonSeriliazeService;
import org.example.services.Balancemanager;
import org.example.services.Logger;

public class Container {
    public PaymentCardFactory paymentCardFactory;
    public PaymentCardNumberGenerator paymentCardNumberGenerator;
    public PaymentCardCvvGenerator paymentCardCvvGenerator;
    public PaymentCardPinGenerator paymentCardPinGenerator;
    public PaymentCardExpireDateGenerator paymentCardExpireDateGenerator;
    public Logger logger;
    public BankAccountFactorie bankAccountFactorie;
    public AccountStorage accountStorage;
    public Balancemanager balancemanager;
    public AccountOwnerJsonSeriliazeService accountOwnerJsonSeriliazeService;
    public Container() {
        this.accountStorage = new AccountStorage();
        this.accountOwnerJsonSeriliazeService = new AccountOwnerJsonSeriliazeService();

        this.paymentCardNumberGenerator = new PaymentCardNumberGenerator();

        this.paymentCardCvvGenerator = new PaymentCardCvvGenerator();

        this.paymentCardPinGenerator = new PaymentCardPinGenerator();

        this.paymentCardExpireDateGenerator = new PaymentCardExpireDateGenerator();

        this.paymentCardFactory = new PaymentCardFactory(paymentCardNumberGenerator,paymentCardCvvGenerator,paymentCardPinGenerator,paymentCardExpireDateGenerator);

        this.logger = new Logger();

        this.balancemanager = new Balancemanager();

        this.bankAccountFactorie = new BankAccountFactorie(accountStorage);
    }
}
