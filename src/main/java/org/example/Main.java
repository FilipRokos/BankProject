
package org.example;

import org.example.Accounts.BaseAccount;
import org.example.Accounts.StudentBankAccount;
import org.example.people.Student;
import org.example.services.Balancemanager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BaseAccount studentskyAccount = new StudentBankAccount("895",1000,String.valueOf(Bankaccountnum.generator()), (new Student("76543456","Filip", "Rokos", "Delta")));
        Balancemanager balance_manager = new Balancemanager();
        if(studentskyAccount.GetOwner() instanceof Student) {
            System.out.println(((Student) studentskyAccount.GetOwner()).GetSchool());
            System.out.println( studentskyAccount.getAccountNumber());
            System.out.println( studentskyAccount.getBalance());
            balance_manager.addBalance(studentskyAccount,10000);
            System.out.println( studentskyAccount.getBalance());

        }
    }
}
