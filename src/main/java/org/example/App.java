package org.example;
import com.google.inject.Singleton;
import jakarta.inject.Inject;
import org.example.Accounts.BankAccount;
import org.example.Accounts.BaseAccount;
import org.example.Accounts.StudentBankAccount;
import org.example.cards.PaymentCardFactory;
import org.example.factories.BankAccountFactorie;
import org.example.people.BaseHuman;
import org.example.people.Student;
import org.example.Storages.AccountStorage;
import org.example.seriliatition.AccountOwnerJsonSeriliazeService;
import org.example.services.Balancemanager;
import org.example.Accounts.BankAccountWithPaymentCard;
import org.example.App;
import org.example.services.Logger;

@Singleton
public class App {
    @Inject
    PaymentCardFactory paymentCardFactory;

    @Inject
    BankAccountFactorie bankAccountFactorie;
    @Inject
    Balancemanager balancemanager;
    @Inject
    AccountOwnerJsonSeriliazeService accountOwnerJsonSeriliazeService;
    @Inject
    Logger logger;


    public void run()
    {

        BaseAccount studentskyAccount = new StudentBankAccount("895",1000,String.valueOf(Bankaccountnum.generator()), (new Student("76543456","Filip", "Rokos", "Delta")));
        BaseAccount account = new BaseAccount("7456",1000,String.valueOf(Bankaccountnum.generator()),(new BaseHuman("7456","Honza","Va")));
        BankAccountWithPaymentCard cardAccount = new BankAccountWithPaymentCard("745600",10000,String.valueOf(Bankaccountnum.generator()),(new BaseHuman("745600","Vojta","Kaška")));

        BankAccount acc = bankAccountFactorie.createBankAccount("7456",(new BaseHuman("7456","Honza","Va")),1000);
        System.out.println("Bank account created");
        acc.addPaymentCard(paymentCardFactory.create());
    }
}
