package userInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

import Tasks.cstask3.Exception.InsufficientBalanceExcepiton;
import Tasks.cstask3.Exception.NegativeAmountException;
import Tasks.cstask3.blogic.bankAccount;

public class Account {


    public static void main(String []args) throws InputMismatchException, InsufficientBalanceExcepiton, NegativeAmountException{
           
        Scanner scn=new Scanner(System.in);
        System.out.println("Do you want to create Account");
        System.out.println("Y for yes");
        System.out.println("N for no");

        char choice=scn.next().charAt(0);scn.nextLine();

        if(choice=='y'){
            bankAccount a1=new bankAccount();
            System.out.println();
            System.out.println("Enter your Account Holder Name:->");
            a1.setAc_HName(scn.nextLine());
            System.out.println("Enter amount to Deposit:->");
            a1.setAc_Balance(scn.nextLong());
            System.out.println("Bank Account created");
            char cht;

           do{
            System.out.println();
            System.out.println("Do you want perform any operation");
            System.out.println("Enter similar number to perform operation");
            System.out.println("1:Withdraw Account balance");
            System.out.println("2:Deposit Account balance");
            System.out.println("3:Check Account Balance");
            System.out.println("4:Check Account details");
            System.out.println();
            int opt=scn.nextInt();

            switch(opt){
                case 1:
                   
                     System.out.println("\nEnter amount to withdraw");
                      a1.withdraw(scn.nextLong());
                      break;
                case 2:
                       System.out.println("\nEnter amount to deposit");
                       a1.deposit(scn.nextLong());
                       break;
                case 3:
                          System.out.println(a1.getBalnce());
                       break;
                case 4:                   
                       System.out.println(a1);
                       break;                
            }
            System.out.println("Do you want perform any other operation (y/n):->");
            cht=scn.next().charAt(0);

           }while(cht=='y'||cht=='Y');
        }else{
            System.out.println("tumari fellow go then");
        }

    }

    
}
