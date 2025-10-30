package org.example;
import jakarta.inject.Inject;
import org.example.Accounts.BaseAccount;
import org.example.Accounts.StudentBankAccount;
import org.example.cards.PaymentCardFactory;
import org.example.people.BaseHuman;
import org.example.people.Student;
import org.example.Storages.AccountStorage;
import org.example.services.Balancemanager;
import org.example.Accounts.BankAccountWithPaymentCard;
import org.example.App;
public class App {
    @Inject
    Container container;
    public void run()
    {

        BaseAccount studentskyAccount = new StudentBankAccount("895",1000,String.valueOf(Bankaccountnum.generator()), (new Student("76543456","Filip", "Rokos", "Delta")));
        BaseAccount account = new BaseAccount("7456",1000,String.valueOf(Bankaccountnum.generator()),(new BaseHuman("7456","Honza","Va")));
        BankAccountWithPaymentCard cardAccount = new BankAccountWithPaymentCard("745600",10000,String.valueOf(Bankaccountnum.generator()),(new BaseHuman("745600","Vojta","Kaška")));

        container.bankAccountFactorie.createBankAccount("7456",(new BaseHuman("7456","Honza","Va")),1000);
    }
}
