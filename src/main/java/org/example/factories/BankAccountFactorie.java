package org.example.factories;

import com.google.inject.Inject;
import org.example.Accounts.BankAccount;
import org.example.Accounts.BaseAccount;
import org.example.Accounts.SavingBankAccount;
import org.example.Accounts.StudentBankAccount;
import org.example.Bankaccountnum;
import org.example.Storages.AccountStorage;
import org.example.people.AccountOwner;
import org.example.people.BaseHuman;
import org.example.people.Student;
import org.example.Bankaccountnum;
public class BankAccountFactorie {
    @Inject
    public AccountStorage accountStorage;
    @Inject
    public BankAccountFactorie(AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }
    public BankAccount createBankAccount(String uuid, BaseHuman owner,double balanc) {
        BankAccount acc = new BankAccount(uuid,balanc,String.valueOf(Bankaccountnum.generator()),owner);
        accountStorage.addAccount(acc);
        return acc;
    }
    public StudentBankAccount createStudentBankAccount(String uuid,double balance,Student owner) {
        StudentBankAccount acc =  new StudentBankAccount(uuid,balance,String.valueOf(Bankaccountnum.generator()),owner);
        accountStorage.addAccount(acc);
        return acc;
    }
    public SavingBankAccount createSavingBankAccount(String uuid,double balance,BaseHuman owner,double interestRate) {
        SavingBankAccount acc = new SavingBankAccount(uuid,balance,String.valueOf(Bankaccountnum.generator()),owner,interestRate);
        accountStorage.addAccount(acc);
        return acc;
    }

}
