
package org.example;

import org.example.Accounts.BaseAccount;
import org.example.Accounts.StudentBankAccount;
import org.example.cards.PaymentCard;
import org.example.cards.PaymentCardFactory;
import org.example.people.AccountOwner;
import org.example.people.BaseHuman;
import org.example.people.Student;
import org.example.seriliatition.AccountOwnerJsonSeriliazeService;
import org.example.seriliatition.AccountOwnerXMLSeriliazeService;
import org.example.services.AccountStorage;
import org.example.services.Balancemanager;
import org.example.Accounts.BankAccountWithPaymentCard;
import org.example.Accounts.BankAccountWithPaymentCard;
import org.example.services.PayCardService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BaseAccount studentskyAccount = new StudentBankAccount("895",1000,String.valueOf(Bankaccountnum.generator()), (new Student("76543456","Filip", "Rokos", "Delta")));
        BaseAccount account = new BaseAccount("7456",1000,String.valueOf(Bankaccountnum.generator()),(new BaseHuman("7456","Honza","Va")));
        BankAccountWithPaymentCard cardAccount = new BankAccountWithPaymentCard("745600",10000,String.valueOf(Bankaccountnum.generator()),(new BaseHuman("745600","Vojta","Kaška")));
        Balancemanager balance_manager = new Balancemanager();
        PaymentCardFactory  payment_card_factory = new PaymentCardFactory();
        PayCardService payCardService = new PayCardService();
        AccountStorage accountStorage = new AccountStorage();
        cardAccount.addPaymentCard(payment_card_factory.create());
        accountStorage.addAccount(cardAccount);
        System.out.println(cardAccount.getBalance());
        System.out.println(cardAccount.getPaymentCards().get(0));
        balance_manager.cardTransaction(accountStorage,cardAccount.getPaymentCards().getFirst(),1000,true);
        System.out.println(cardAccount.getBalance());

        }
    }

