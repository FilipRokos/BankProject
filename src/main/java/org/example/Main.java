
package org.example;

import org.example.Accounts.BaseAccount;
import org.example.Accounts.StudentBankAccount;
import org.example.people.BaseHuman;
import org.example.people.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BaseAccount studentskyAccount = new StudentBankAccount("895",1000,"3456", (new Student("76543456","Filip", "Rokos", "Delta")));

        if(studentskyAccount.GetOwner() instanceof Student) {
            System.out.println(((Student) studentskyAccount.GetOwner()).GetSchool());
        }
    }
}
