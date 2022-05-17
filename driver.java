package com.OOP;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            bank NewBank = new bank("RpBank");

            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for CreateNewAccount");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Withdraw");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int operation = input.nextInt();
            if (operation == 1){
                account acc = new account(0.0);
                System.out.println("Please enter your firstname: ");
                String firstname = input.next();
                System.out.println("Please enter your lastname: ");
                String lastname = input.next();
                bank.addCustomer(firstname, lastname);
            }
            if (operation == 2){
                System.out.println("Please Enter the Account Index: ");
                int index = input.nextInt();
                System.out.print("Please Enter Money to be deposited:");
                int deposit = input.nextInt();
                bank.getNumberOfCustomer(index-1).getCustomer.deposit(deposit);
                System.out.println("Your deposit amount is ", bank.getNumberOfCustomer(index-1).getCustomer.deposit(deposit));

                System.out.println("Your Money has been successfully deposited");
                System.out.println("");
            }
            if (operation == 3){
                System.out.println("Please Enter the Account Index");
                int index = input.nextInt();
                System.out.print("Please Enter Money to be withdrawn:");
                int withdraw = input.nextInt();
                bank.getCustomer(index-1).getAccount().withdraw(withdraw);
                System.out.printf("Balance: %f \n", bank.getCustomer(index -1).getAccount().getBalance());
            }
            if(operation == 4){
                System.out.println("Thank you for using RpBank.");
            }
        }
    }
}