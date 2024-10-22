package com.java.Demos;

class Account{
    String AccHolderName;
    double AmtBalance;

    public Account(String AccHolderName, double AmtBalance){
        this.AccHolderName = AccHolderName;
        this.AmtBalance = AmtBalance;
    }

    public void ShowAccDetails(){
        System.out.println("The AccountHolder Name" + " " + AccHolderName);
        System.out.println("The current balance is" + " " + AmtBalance);
    }

    public void deposit(double amount){
        AmtBalance += amount;
        System.out.println("Deposited:" +" " + amount + " " + "New Balance:" + " " + AmtBalance);

    }
}

class SavingsAccount extends Account{


    public SavingsAccount(String AccHolderName, double AmtBalance) {
        super(AccHolderName, AmtBalance);
//        this.withdraw = withdraw;
    }

    public void withdraw(double withdraw){
        withdraw = AmtBalance - withdraw;
        System.out.println("The current balance in Account after withdrawal is " + " " + withdraw);
    }
}


public class BankAccount {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("Sathish Kumar", 500);
        savings.ShowAccDetails();
        savings.deposit(100);
        savings.withdraw(300);
    }
}
