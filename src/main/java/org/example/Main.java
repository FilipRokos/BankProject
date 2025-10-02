
package org.example;

import org.example.Accounts.BaseAccount;
import org.example.Accounts.StudentBankAccount;
import org.example.people.AccountOwner;
import org.example.people.BaseHuman;
import org.example.people.Student;
import org.example.seriliatition.AccountOwnerJsonSeriliazeService;
import org.example.seriliatition.AccountOwnerXMLSeriliazeService;
import org.example.services.Balancemanager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BaseAccount studentskyAccount = new StudentBankAccount("895",1000,String.valueOf(Bankaccountnum.generator()), (new Student("76543456","Filip", "Rokos", "Delta")));
        BaseAccount account = new BaseAccount("7456",1000,String.valueOf(Bankaccountnum.generator()),(new BaseHuman("7456","Honza","Va")));
        Balancemanager balance_manager = new Balancemanager();
        AccountOwnerJsonSeriliazeService accountServiceJson = new AccountOwnerJsonSeriliazeService();
        AccountOwnerXMLSeriliazeService accountServiceXML = new AccountOwnerXMLSeriliazeService();
        if(studentskyAccount.GetOwner() instanceof Student) {
            System.out.println(((Student) studentskyAccount.GetOwner()).GetSchool());
            System.out.println( studentskyAccount.getAccountNumber());
            System.out.println( studentskyAccount.getBalance());
            balance_manager.addBalance(studentskyAccount,10000);
            System.out.println( studentskyAccount.getBalance());
            System.out.println(accountServiceJson.serialize(account.GetOwner()));
            System.out.println(accountServiceXML.serialize(account.GetOwner()));
        }
    }
}
