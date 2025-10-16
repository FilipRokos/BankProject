package org.example.factories;

import org.example.Accounts.BankAccount;
import org.example.Accounts.BaseAccount;
import org.example.Accounts.SavingBankAccount;
import org.example.Accounts.StudentBankAccount;
import org.example.Bankaccountnum;
import org.example.people.AccountOwner;
import org.example.people.BaseHuman;
import org.example.people.Student;
import org.example.Bankaccountnum;
public class BankAccountFactorie {

   /* public BankAccount createBankAccount(String uuid, AccountOwner owner) {
        return new BankAccount(uuid,owner.getFirstName(),owner.getLastName());
    }
    public StudentBankAccount createStudentBankAccount(String uuid,double balance,Student owner) {
        return new StudentBankAccount(uuid,balance,String.valueOf(Bankaccountnum.generator()),owner);
    }
    public SavingBankAccount createSavingBankAccount(String uuid,double balance,BaseHuman owner,double interestRate) {
        return new SavingBankAccount(uuid,balance,String.valueOf(Bankaccountnum.generator()),owner,interestRate);
    }
*/
}
